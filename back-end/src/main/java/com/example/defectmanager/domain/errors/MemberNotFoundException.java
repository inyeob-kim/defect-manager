package com.example.defectmanager.domain.errors;

public class MemberNotFoundException extends Exception {

    public MemberNotFoundException(String msg) {
        super(msg);
    }
}
