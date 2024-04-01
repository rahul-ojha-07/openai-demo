package com.example.openaidemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceDTO {
    private int index;
    private MessageDTO message;
    private Object logprobs;
    private String finishReason;
}