package com.personalproject.employee.entity;

import com.personalproject.employee.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="employee_code", nullable=false, unique=true, length=20)
    private String employeeCode;

    @Column(name="first_name", nullable=false, length=100)
    private String firstName;

    @Column(name="last_name", nullable=false, length=100)
    private String lastName;

    @Column(name="email", nullable=false, unique=true)
    private String email;

    @Column(name="phone_number", nullable=false, length=20)
    private String phoneNumber;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="date_of_joining", nullable = false)
    private LocalDate dateOfJoining;

    @Column(name="designation", nullable=false, length=100)
    private String designation;

    @Column(name="salary", nullable=false, precision=12, scale=2)
    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    @Column(name="status", nullable=false, length=20)
    private EmployeeStatus status;

    @Column(name="created_at", nullable=false, insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name="updated_at", nullable=false, insertable = false)
    private LocalDateTime updatedAt;
}
