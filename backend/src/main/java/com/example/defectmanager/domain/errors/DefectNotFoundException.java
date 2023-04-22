package com.example.defectmanager.domain.errors;

public class DefectNotFoundException extends Exception {

    public DefectNotFoundException(String msg) {
        super(msg);
    }
}
