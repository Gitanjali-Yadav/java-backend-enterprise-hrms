package com.personalproject.employee.controller;

import com.personalproject.common.response.ApiResponse;
import com.personalproject.employee.dto.request.CreateEmployeeRequest;
import com.personalproject.employee.dto.response.EmployeeResponse;
import com.personalproject.employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ApiResponse<EmployeeResponse> createEmployee(@Valid @RequestBody CreateEmployeeRequest request){
        return employeeService.createEmployee(request);
    }
}
