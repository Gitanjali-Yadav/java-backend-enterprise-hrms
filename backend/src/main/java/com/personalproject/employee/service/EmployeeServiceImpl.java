package com.personalproject.employee.service;

import com.personalproject.common.exception.ResourceAlreadyExistsException;
import com.personalproject.common.response.ApiResponse;
import com.personalproject.employee.dto.request.CreateEmployeeRequest;
import com.personalproject.employee.dto.response.EmployeeResponse;
import com.personalproject.employee.entity.Employee;
import com.personalproject.employee.mapper.EmployeeMapper;
import com.personalproject.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository repository;

    @Override
    public ApiResponse<EmployeeResponse> createEmployee(CreateEmployeeRequest request) {

        if(repository.existsByEmployeeCode(request.getEmployeeCode())){
            throw new ResourceAlreadyExistsException("Employee Code already exists.");
        }

        if(repository.existsByEmail(request.getEmail())){
            throw new ResourceAlreadyExistsException("Email Already Exists.");
        }

        Employee employee = EmployeeMapper.toEntity(request);

        Employee savedEmployee = repository.save(employee);

        EmployeeResponse response = EmployeeMapper.toResponse(savedEmployee);


        return new  ApiResponse<>(
                true,
                "Employee created Successfully!",
                response
                );

    }
}
