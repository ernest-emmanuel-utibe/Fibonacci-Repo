package com.semicolon.FibonacciApp.service;

import com.semicolon.FibonacciApp.dto.UserRequest;
import com.semicolon.FibonacciApp.dto.UserResponse;

public interface UserService {

    public UserResponse register(UserRequest userRequest);
    public long calculateFibonacci(int number);
}
