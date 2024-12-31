package com.practiceMicro.PHotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource not found at server...");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
