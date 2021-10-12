package com.deloitte.weatherassessment.exception;

import org.springframework.http.HttpStatus;

public class BaseCustomException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    protected final int errorCode;
    protected final String errorMessage;
    protected final String errorDetails;
    protected final HttpStatus httpStatus;
    private final Object errorResult;

    public BaseCustomException(int errorCode, String errorMessage, String errorDetails, Object errorResult, HttpStatus httpStatus) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
        this.errorResult = errorResult;
        this.httpStatus = httpStatus;
    }

    public BaseCustomException(int errorCode, String errorMessage, String errorDetails, Throwable cause, Object errorResult, HttpStatus httpStatus) {
        super(errorMessage, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
        this.errorResult = errorResult;
        this.httpStatus = httpStatus;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getErrorDetails() {
        return this.errorDetails;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public Object getErrorResult() {
        return this.errorResult;
    }

    public String toString() {
        return "BaseCustomException{errorCode=" + this.errorCode + ", errorMessage='" + this.errorMessage + '\'' + ", errorDetails='" + this.errorDetails + '\'' + ", httpStatus=" + this.httpStatus + ", errorResult=" + this.errorResult + '}';
    }
}
