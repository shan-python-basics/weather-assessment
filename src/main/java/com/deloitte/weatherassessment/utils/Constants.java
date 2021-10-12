package com.deloitte.weatherassessment.utils;

public class Constants {
    public class APIConstants {
        public static final String API_BASE_PATH = "${api.basepath}";

        public class ErrorCodesConstants {
            public static final int MISSING_FIELD_ERROR_CODE = 1001;
            public static final int MISMATCH_FIELD_ERROR_CODE = 1002;
            public static final int INVALID_REQUEST_ERROR_CODE = 1003;
            public static final int INTERNAL_ERROR_CODE = 10001;
            public static final int UNKNOWN_HOST_ERROR_CODE = 10001;
            public static final int TIMEOUT_ERROR_CODE = 10002;
            public static final int GENERIC_TECH_HOST_ERROR_CODE = 10003;

            public static final String INTERNAL_ERROR_MSG = "Technical error";
            public static final String INTERNAL_ERROR_DETAILS = "Technical/Runtime error";

            public static final String UNKNOWN_HOST_ERROR_MSG = "Host Unavailable";
            public static final String UNKNOWN_HOST_ERROR_DETAILS = "The downstream system failed to accept the request";
            public static final String TIMEOUT_ERROR_MSG = "Provider Timeout";
            public static final String TIMEOUT_ERROR_DETAILS = "The downstream system failed to respond within expected time periods";
            public static final String GENERIC_TECH_ERROR_MSG = "Technical error";
            public static final String GENERIC_TECH_ERROR_DETAILS = "Service error occurred";

            public static final String INVALID_REQUEST_ERROR_MESSAGE = "Invalid request";
            public static final String ERR_MSG_INVALID_XSSERR = "Unrecognized field in request body";
        }
    }

    public class XSSFilterConstants {
        public static final String ERR_MSG_INVALID_REQ = "Invalid request";
        public  static final String ERR_MSG_TECHNICAL_ERROR = "Technical error";
        public static final String ERR_MSG_TIMEOUT_ERROR = "Provider timeout";
        public static final String ERR_DTLS_UNEXPECTED = "Unknown/Runtime Exception occurred during the API execution";
        public static final String SCRIPT_TAG = "<script>(.*?)</script>";
        public static final String PRE_POST_SCRIPT_TAG = ".*<.*>(.*?)</.*>.*";
        public static final String LESS_THAN_TAG = ".*<.*";
        public static final String GREATER_TAG = ".*>.*";
        public static final String SRC_SINGLE_QUOTE_TAG = "src[\\r\\n]*=[\\r\\n]*\\\\\\'(.*?)\\\\\\'";
        public static final String SRC_DOUBLE_QUOTE_TAG = "src[\\r\\n]*=[\\r\\n]*\\\\\\\"(.*?)\\\\\\\"";
        public static final String CLOSE_SCRIPT_TAG = "</script>";
        public static final String OPEN_SCRIPT_TAG = "<script(.*?)>";
        public static final String EVAL_FUN = "eval\\\\((.*?)\\\\)";
        public static final String EXPRESSION_FUN = "expression\\\\((.*?)\\\\)";
        public static final String JAVASCRIPT_FUN = "javascript";
        public static final String VB_SCRIPT_FUN = "vbscript";
        public static final String ONLOAD_FUN = "onload(.*?)=";
        public static final String ERR_MSG_INVALID_XSSERR = "Unrecognized fields in request body";
    }
}
