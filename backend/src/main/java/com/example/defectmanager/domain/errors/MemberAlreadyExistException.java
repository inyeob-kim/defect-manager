package com.example.defectmanager.domain.errors;

public class MemberAlreadyExistException extends Exception {

    public MemberAlreadyExistException(String msg) {
        super(msg);
    }
}
