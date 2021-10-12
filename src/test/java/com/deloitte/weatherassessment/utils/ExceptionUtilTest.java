package com.deloitte.weatherassessment.utils;

import static org.junit.Assert.assertEquals;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestClientException;

import com.deloitte.weatherassessment.exception.BaseCustomException;
import com.deloitte.weatherassessment.utils.Constants.APIConstants.ErrorCodesConstants;

@RunWith(SpringJUnit4ClassRunner.class)
public class ExceptionUtilTest {
    @InjectMocks
    ExceptionUtil exceptionUtil;

    @Test
    public void test_createBaseCustomException_WithBaseCustomException() {
        BaseCustomException exception = new BaseCustomException(ErrorCodesConstants.UNKNOWN_HOST_ERROR_CODE,
                ErrorCodesConstants.UNKNOWN_HOST_ERROR_MSG, ErrorCodesConstants.UNKNOWN_HOST_ERROR_DETAILS,
                null, HttpStatus.INTERNAL_SERVER_ERROR);

        BaseCustomException actual = exceptionUtil.createBaseCustomException(exception);

        assertEquals(exception.getErrorCode(), actual.getErrorCode());
        assertEquals(exception.getErrorMessage(), actual.getErrorMessage());
        assertEquals(exception.getErrorDetails(), actual.getErrorDetails());
    }

    @Test
    public void test_createBaseCustomException_WithInitCauseBaseCustomException() {
        BaseCustomException bce = new BaseCustomException(ErrorCodesConstants.UNKNOWN_HOST_ERROR_CODE,
                ErrorCodesConstants.UNKNOWN_HOST_ERROR_MSG, ErrorCodesConstants.UNKNOWN_HOST_ERROR_DETAILS,
                null, HttpStatus.INTERNAL_SERVER_ERROR);

        Exception exception = new Exception(bce);
        BaseCustomException actual = exceptionUtil.createBaseCustomException(exception);

        assertEquals(bce.getErrorCode(), actual.getErrorCode());
        assertEquals(bce.getErrorMessage(), actual.getErrorMessage());
        assertEquals(bce.getErrorDetails(), actual.getErrorDetails());
    }

    @Test
    public void test_createBaseCustomException_WithInitCause_AsUnknownHostException() {
        Exception exception = new Exception(new UnknownHostException());
        BaseCustomException actual = exceptionUtil.createBaseCustomException(exception);

        assertEquals(ErrorCodesConstants.UNKNOWN_HOST_ERROR_CODE, actual.getErrorCode());
        assertEquals(ErrorCodesConstants.UNKNOWN_HOST_ERROR_MSG, actual.getErrorMessage());
        assertEquals(ErrorCodesConstants.UNKNOWN_HOST_ERROR_DETAILS, actual.getErrorDetails());
    }

    @Test
    public void test_createBaseCustomException_WithInitCause_AsSocketTimeoutException() {
        Exception exception = new Exception(new SocketTimeoutException());
        BaseCustomException actual = exceptionUtil.createBaseCustomException(exception);

        assertEquals(ErrorCodesConstants.TIMEOUT_ERROR_CODE, actual.getErrorCode());
        assertEquals(ErrorCodesConstants.TIMEOUT_ERROR_MSG, actual.getErrorMessage());
        assertEquals(ErrorCodesConstants.TIMEOUT_ERROR_DETAILS, actual.getErrorDetails());
    }

    @Test
    public void test_createBaseCustomException_WithInitCause_AsOtherException() {
        Exception exception = new Exception(new RestClientException(""));
        BaseCustomException actual = exceptionUtil.createBaseCustomException(exception);

        assertEquals(ErrorCodesConstants.GENERIC_TECH_HOST_ERROR_CODE, actual.getErrorCode());
        assertEquals(ErrorCodesConstants.GENERIC_TECH_ERROR_MSG, actual.getErrorMessage());
        assertEquals(ErrorCodesConstants.GENERIC_TECH_ERROR_DETAILS, actual.getErrorDetails());
    }
}