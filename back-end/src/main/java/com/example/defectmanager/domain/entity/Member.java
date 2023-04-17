package com.example.defectmanager.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3
    private Long id;

    private String firstName;

    private String lastName;

    private String memberType;

    private Long teamId;

    public List<Defect> getListDefect() {
        return null;
    }

}

