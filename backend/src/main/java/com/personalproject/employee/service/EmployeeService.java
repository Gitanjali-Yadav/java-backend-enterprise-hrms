package com.personalproject.employee.service;

import com.personalproject.common.response.ApiResponse;
import com.personalproject.employee.dto.request.CreateEmployeeRequest;
import com.personalproject.employee.dto.response.EmployeeResponse;

public interface EmployeeService {

    ApiResponse<EmployeeResponse> createEmployee(CreateEmployeeRequest request);
}
