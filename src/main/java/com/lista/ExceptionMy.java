package com.lista;

public class ExceptionMy extends Exception {
    public ExceptionMy() {
    }

    public ExceptionMy(String message) {
        super(message);
    }

    public ExceptionMy(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionMy(Throwable cause) {
        super(cause);
    }

    public ExceptionMy(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
