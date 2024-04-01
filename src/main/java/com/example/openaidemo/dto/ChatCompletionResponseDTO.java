package com.example.openaidemo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatCompletionResponseDTO {
    private String id;
    private String object;
    private long created;
    private String model;
    private String systemFingerprint;
    private List<ChoiceDTO> choices;
    private UsageDTO usage;
    private String error;
}