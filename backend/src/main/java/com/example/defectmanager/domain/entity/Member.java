package com.example.defectmanager.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "tbl_member",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "email_unique",
                        columnNames = "email "
                )
        }
)
@Entity
public class Member {

    @Id
    @SequenceGenerator(
            name = "member_sequence",
            sequenceName = "member_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "member_sequence"
    ) // 3
    private Long id;

    private String firstName;

    private String lastName;

    @Column(
            name = "email",
            nullable = false
    )
    private String email;

    private String phoneNumber;
    private String password;

    private String role;

}

