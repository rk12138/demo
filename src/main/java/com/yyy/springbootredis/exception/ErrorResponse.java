package com.yyy.springbootredis.exception;

import org.springframework.util.ObjectUtils;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class ErrorResponse {
    private int code;
    private int status;
    private String message;
    private String path;
    private Instant timestamp;
    private HashMap<String, Object> data = new HashMap<>();

    public ErrorResponse() {}

    public ErrorResponse(BaseException ex, String path) {
        this(ex.getErrorCode().getCode(), ex.getErrorCode().getHttpStatus().value(), ex.getErrorCode().getMessage(), path, ex.getData());
    }

    public ErrorResponse(int code, int status, String message, String path, Map<String, Object> map) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "code=" + code +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", path='" + path + '\'' +
                ", timestamp=" + timestamp +
                ", data=" + data +
                '}';
    }
}
