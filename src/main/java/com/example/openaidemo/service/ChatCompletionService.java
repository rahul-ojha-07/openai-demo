package com.example.openaidemo.service;

import com.example.openaidemo.dto.ChatCompletionRequestDTO;
import com.example.openaidemo.dto.ChatCompletionResponseDTO;
import com.example.openaidemo.dto.MessageDTO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class ChatCompletionService {

    @NonNull
    RestTemplate restTemplate;
    @Value("${openai.api.url}")
    private String openAiURL;
    @Value("${openai.api.key}")
    private String openAiKey;
    private List<MessageDTO> history;


    public ChatCompletionResponseDTO processRequest(ChatCompletionRequestDTO chatCompletionRequest) {
        HttpEntity<ChatCompletionRequestDTO> httpEntity = new HttpEntity<>(chatCompletionRequest, httpHeaders());
        ResponseEntity<ChatCompletionResponseDTO> chatCompletionResponse = ResponseEntity.ok(null);
        try {
            if (chatCompletionRequest.getSaveHistory()) {
                saveHistoryRequest(chatCompletionRequest);
                chatCompletionRequest.setMessages(history);
            }
            chatCompletionResponse = restTemplate.exchange(URI.create(openAiURL), HttpMethod.POST, httpEntity, ChatCompletionResponseDTO.class);
            if (chatCompletionRequest.getSaveHistory()) {
                saveHistoryResponse(chatCompletionResponse.getBody());
            }
        } catch (Exception e) {
            log.error("Unable to complete request ", e);
            chatCompletionResponse = ResponseEntity.badRequest().body(ChatCompletionResponseDTO.builder()
                    .error(e.getMessage())
                    .build());
        }
        return chatCompletionResponse.getBody();
    }

    /**
     * Set HTTP Headers here
     *
     * @return httpHeaders
     */
    private HttpHeaders httpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, "application/json");
        headers.set(HttpHeaders.AUTHORIZATION, MessageFormat.format("Bearer {0}", openAiKey));
        return headers;
    }


    /**
     * Save the request messages to previous messages
     *
     * @param request request to send to openAI api
     */
    private void saveHistoryRequest(ChatCompletionRequestDTO request) {
        if (history == null) history = new ArrayList<>();
        if (history.isEmpty()) {
            history.addAll(request.getMessages()
                    .stream()
                    .toList());
        } else {
            history.addAll(request.getMessages()
                    .stream()
                    .filter(x -> !x.getRole().equals("system"))
                    .toList());
        }
    }

    /**
     * Save the assistant response messages to the history
     *
     * @param response response returned after calling the openAi API
     */
    private void saveHistoryResponse(ChatCompletionResponseDTO response) {
        if (history == null) history = new ArrayList<>();
        if (!response.getChoices().isEmpty()) {
            history.add(response.getChoices().get(0).getMessage());
        }
    }

}
