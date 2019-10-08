package ru.brakhin.depservice.result;

import ru.brakhin.depservice.models.Service;

import java.util.List;

public class ServiceResult {

    private final int errorCode;

    public ServiceResult(int errorCode) {
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
}