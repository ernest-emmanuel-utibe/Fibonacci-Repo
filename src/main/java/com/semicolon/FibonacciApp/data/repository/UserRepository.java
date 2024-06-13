package com.semicolon.FibonacciApp.data.repository;

import com.semicolon.FibonacciApp.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
