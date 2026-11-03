package com.example.hrm.response;

public class ApiResponse<T> {
    private String status;  // "SUCCESS" hoặc "FAIL"
    private String message; // Thông báo mô tả
    private T data;         // Dữ liệu trả về hoặc chi tiết lỗi

    public ApiResponse(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Getters và Setters
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}