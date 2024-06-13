package com.semicolon.FibonacciApp;

import com.semicolon.FibonacciApp.dto.UserRequest;
import com.semicolon.FibonacciApp.dto.UserResponse;
import com.semicolon.FibonacciApp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;
    @Test
    void registerUser() {
        UserRequest userRequest = new UserRequest();
        userRequest.setFirstName("test");
        userRequest.setLastName("user");
        userRequest.setEmail("test@email.com");

        UserResponse response = userService.register(userRequest);
        assertTrue(response.isSuccess());
    }
}
