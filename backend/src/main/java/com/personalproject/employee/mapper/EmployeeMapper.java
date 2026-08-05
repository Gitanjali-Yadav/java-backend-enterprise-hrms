package com.personalproject.employee.mapper;

import com.personalproject.employee.dto.request.CreateEmployeeRequest;
import com.personalproject.employee.dto.response.EmployeeResponse;
import com.personalproject.employee.entity.Employee;

public class EmployeeMapper {

    public static Employee toEntity(CreateEmployeeRequest request){

        return Employee.builder()
                .employeeCode(request.getEmployeeCode())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .dateOfBirth(request.getDateOfBirth())
                .dateOfJoining(request.getDateOfJoining())
                .designation(request.getDesignation())
                .salary(request.getSalary())
                .status(request.getStatus())
                .build();
    }

    public static EmployeeResponse toResponse(Employee employee){
        return EmployeeResponse.builder()
                .id(employee.getId())
                .employeeCode(employee.getEmployeeCode())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .phoneNumber(employee.getPhoneNumber())
                .dateOfBirth(employee.getDateOfBirth())
                .dateOfJoining(employee.getDateOfJoining())
                .designation(employee.getDesignation())
                .salary(employee.getSalary())
                .status(employee.getStatus())
                .createdAt(employee.getCreatedAt())
                .updatedAt(employee.getUpdatedAt())
                .build();
    }
}
