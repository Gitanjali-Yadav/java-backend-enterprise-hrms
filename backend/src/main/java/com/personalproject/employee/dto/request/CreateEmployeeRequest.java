package com.personalproject.employee.dto.request;

import com.personalproject.employee.enums.EmployeeStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CreateEmployeeRequest {

    @NotBlank(message="Employee Code is required")
    private String employeeCode;

    @NotBlank(message="FirstName is required")
    private String firstName;

    @NotBlank(message="LastName is required")
    private String lastName;

    @Email(message="Invalid Email")
    @NotBlank(message="Email is required")
    private String email;

    @NotBlank(message="Phone Number is required")
    private String phoneNumber;

    @NotNull(message="Date of Birth is required")
    private LocalDate dateOfBirth;

    @NotNull(message="Date of Joining is required")
    private LocalDate dateOfJoining;

    @NotBlank(message="Designation is required")
    private String designation;

    @NotNull(message="Salary is required")
    @Positive(message="Salary must be positive")
    private BigDecimal salary;

    @NotNull(message="Status is required")
    private EmployeeStatus status;

}
