package com.deloitte.weatherassessment.utils;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import com.deloitte.weatherassessment.exception.BaseCustomException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.deloitte.weatherassessment.utils.Constants.APIConstants.ErrorCodesConstants;

@Component
public class ExceptionUtil {
    public BaseCustomException createBaseCustomException(Exception ex) {
        if (ex instanceof BaseCustomException) {
            return (BaseCustomException) ex;
        }

        if (ex.getCause() instanceof BaseCustomException) {
            return (BaseCustomException) ex.getCause();
        } else {
            BaseCustomException exception;

            if (ex.getCause() instanceof UnknownHostException) {
                exception = new BaseCustomException(ErrorCodesConstants.UNKNOWN_HOST_ERROR_CODE,
                        ErrorCodesConstants.UNKNOWN_HOST_ERROR_MSG, ErrorCodesConstants.UNKNOWN_HOST_ERROR_DETAILS,
                        null, HttpStatus.INTERNAL_SERVER_ERROR);
            } else if (ex.getCause() instanceof SocketTimeoutException) {
                exception = new BaseCustomException(ErrorCodesConstants.TIMEOUT_ERROR_CODE,
                        ErrorCodesConstants.TIMEOUT_ERROR_MSG, ErrorCodesConstants.TIMEOUT_ERROR_DETAILS,
                        null, HttpStatus.INTERNAL_SERVER_ERROR);
            } else {
                exception = new BaseCustomException(ErrorCodesConstants.GENERIC_TECH_HOST_ERROR_CODE,
                        ErrorCodesConstants.GENERIC_TECH_ERROR_MSG, ErrorCodesConstants.GENERIC_TECH_ERROR_DETAILS,
                        null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
            exception.initCause(ex);
            return exception;
        }
    }
}
