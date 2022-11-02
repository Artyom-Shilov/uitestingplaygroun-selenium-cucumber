package com.shilov.training.exceptions;

public class DynamicTableException extends RuntimeException {

    public DynamicTableException() {
        super();
    }

    public DynamicTableException(String message) {
        super(message);
    }

    public DynamicTableException(String message, Throwable cause) {
        super(message, cause);
    }

    public DynamicTableException(Throwable cause) {
        super(cause);
    }
}
