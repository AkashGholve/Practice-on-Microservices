package com.practiceMicro.PUserService.payload;

import org.springframework.http.HttpStatus;

public class ApiResponse {

    private String message;
    private boolean success;
    private HttpStatus status;

    public ApiResponse() {
    }

    public ApiResponse(String message, boolean success, HttpStatus status) {
        this.message = message;
        this.success = success;
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    // Private constructor for builder
    private ApiResponse(Builder builder) {
        this.message = builder.message;
        this.success = builder.success;
        this.status = builder.status;
    }

    // Static inner class for Builder
    public static class Builder {
        private String message;
        private boolean success;
        private HttpStatus status;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            return new ApiResponse(this);
        }
    }

    // Static method to initiate the builder
    public static Builder builder() {
        return new Builder();
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
