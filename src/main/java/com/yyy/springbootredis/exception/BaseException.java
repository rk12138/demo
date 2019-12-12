package com.yyy.springbootredis.exception;

import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseException extends RuntimeException {
    private final ErrorCode errorCode;
    private final HashMap<String, Object> data = new HashMap<>();

    public BaseException(ErrorCode errorCode, Map<String, Object> data) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected BaseException(ErrorCode errorCode, HashMap<String, Object> data, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public HashMap<String, Object> getData() {
        return data;
    }
}
