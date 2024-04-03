package com.example.openaidemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true,value = "saveHistory")
public class ChatCompletionRequestDTO {
    @Schema(example = "gpt-3.5-turbo")
    private String model;
    private List<MessageDTO> messages;
    @Schema(example = "false")
    private Boolean saveHistory = false;
}
