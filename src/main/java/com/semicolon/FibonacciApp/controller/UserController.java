package com.semicolon.FibonacciApp.controller;

import com.semicolon.FibonacciApp.dto.UserRequest;
import com.semicolon.FibonacciApp.dto.UserResponse;
import com.semicolon.FibonacciApp.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/User")
@Tag(name = "Example Controller", description = "Example controller description")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    @Operation(summary = "Example API", description = "Description of the example API")
    public ResponseEntity<?> register(@RequestBody UserRequest userRequest) {
        try {
            UserResponse response = userService.register(userRequest);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
        }
    }


    @GetMapping("/{number}")
    @Operation(summary = "Example API", description = "Description of the example API")
    public ResponseEntity<Long> getFibonacci(@PathVariable int number) {
        if (number < 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        long result = userService.calculateFibonacci(number);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
