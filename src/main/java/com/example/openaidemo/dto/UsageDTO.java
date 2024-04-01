package com.example.openaidemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsageDTO {
    private int promptTokens;
    private int completionTokens;
    private int totalTokens;
}
