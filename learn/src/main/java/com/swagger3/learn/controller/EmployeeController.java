package com.swagger3.learn.controller;

import com.swagger3.learn.model.Employee;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping(value="/{id}",  produces="application/json")
    @Operation(summary = "Get employee by ID", description = "Returns a single employee based on their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = Employee.class))),
            @ApiResponse(responseCode = "404", description = "Employee not found"),
    })
    public Employee getEmployeeById(
            @Parameter(description = "The ID of the employee", required = true)
            @PathVariable UUID id) {
        // implementation
        return Employee.builder()
                .id(id).averageRating((int)Math.random())
                .isActive(true)
                .build();
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update employee by ID", description = "Updates a single employee based on their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = Employee.class))),
            @ApiResponse(responseCode = "404", description = "Employee not found"),
    })
    public Employee updateEmployee(
            @Parameter(description = "The ID of the employee", required = true)
            @PathVariable Long id,
            @RequestBody Employee employee) {
        // implementation

        return new Employee();
    }

    @Hidden
    @DeleteMapping("/{id}")
    public void deleteEmployee(
            @Parameter(description = "The ID of the employee", required = true)
            @PathVariable Long id) {
        // implementation
    }
}
