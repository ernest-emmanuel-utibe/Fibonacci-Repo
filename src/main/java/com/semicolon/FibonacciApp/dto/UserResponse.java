package com.semicolon.FibonacciApp.dto;

import lombok.*;

@Data
@Getter
public class UserResponse {
    private String message;
    private boolean success;
}
