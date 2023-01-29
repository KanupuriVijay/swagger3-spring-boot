package com.swagger2.learn.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swessler.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "User API", description = "Operations related to User management")
public class UserController {

    @PostMapping("/users")
    @Operation(summary = "Create a new user", description = "Create a new user with the provided details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created successfully"),
            @ApiResponse(responseCode = "400", description = "Bad request"),
            @ApiResponse(responseCode = "409", description = "User already exists")
    })
    public User createUser(@RequestBody User user) {
        // Create user logic
        return user;
    }

    @GetMapping("/users/{id}")
    @Operation(summary = "Find user by id", description = "Find user by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    public User getUserById(@PathVariable @Parameter(description = "User id") Long id) {
        // Get user by id logic
        return new User();
    }
}
