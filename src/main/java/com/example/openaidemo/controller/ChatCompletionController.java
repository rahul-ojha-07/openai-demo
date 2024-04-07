package com.example.openaidemo.controller;


import com.example.openaidemo.dto.ChatCompletionRequestDTO;
import com.example.openaidemo.dto.ChatCompletionResponseDTO;
import com.example.openaidemo.service.ChatCompletionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("/")
public class ChatCompletionController {


    ChatCompletionService chatCompletionService;

    @PostMapping("/chat")
    ResponseEntity<ChatCompletionResponseDTO> processRequest(@RequestBody ChatCompletionRequestDTO chatCompletionRequest) {
        return ResponseEntity.ok(chatCompletionService.processRequest(chatCompletionRequest));
    }
}
