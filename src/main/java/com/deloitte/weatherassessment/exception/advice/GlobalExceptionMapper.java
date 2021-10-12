package com.deloitte.weatherassessment.exception.advice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.deloitte.weatherassessment.api.spec.model.ErrorResponse;
import com.deloitte.weatherassessment.api.spec.model.ErrorResult;
import com.deloitte.weatherassessment.api.spec.model.Error;
import com.deloitte.weatherassessment.exception.BaseCustomException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class GlobalExceptionMapper extends ResponseEntityExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionMapper.class);

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(
            final MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.error("Caught handleMissingServletRequestParameter ", ex);
        String errorMsg = "Missing " + ex.getParameterName();
        int errorCode = 1001;
        String errorDetails = ex.getParameterName() + " must not be null";
        return buildResponseEntity(buildErrorObject(errorMsg, errorDetails, errorCode), BAD_REQUEST);
    }

    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        this.logger.error("Caught handleHttpMediaTypeNotSupported ", ex);
        return this.buildResponseEntity(this.buildErrorObject("Invalid request", "Media Type is not supported", 1003), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({BaseCustomException.class})
    protected ResponseEntity<Object> handleBaseCustomException(BaseCustomException ex, WebRequest request) {
        this.logger.error("Caught handleBaseCustomException ", ex);
        if (null != ex.getErrorResult()) {
            return new ResponseEntity(ex.getErrorResult(), ex.getHttpStatus());
        } else {
            Error apiError = this.buildErrorObject(ex.getErrorMessage(), ex.getErrorDetails(), ex.getErrorCode());
            return this.buildResponseEntity(apiError, ex.getHttpStatus());
        }
    }

    protected <T> ResponseEntity<Object> buildResponseEntity(Error error, HttpStatus status) {
        ErrorResponse errorResponse = new ErrorResponse();
        ErrorResult errorResult = new ErrorResult();
        errorResult.addErrorsItem(error);
        errorResponse.setResult(errorResult);
        return new ResponseEntity(errorResponse, status);
    }

    private Error buildErrorObject(String message, String details, int errorCode) {
        Error error = new Error();
        error.setCode(errorCode);
        error.setMessage(message);
        error.setDetails(details);
        return error;
    }
}
