package com.example.defectmanager.application.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MemberRegisterRequestDto {

    @NotEmpty(message = "First name cannot be empty")
    private String firstName;
    @NotEmpty(message = "Last name cannot be empty")
    private String lastName;

    @NotEmpty(message = "Email name cannot be empty")
    @Email(message = "Please provide a valid email id")
    private String email;

    @NotEmpty(message = "Phone number cannot be empty")
    private String phoneNumber;
    @NotEmpty(message = "Password cannot be empty")
    private String password;

    @NotEmpty(message = "Role cannot be empty")
    private String role;
}
