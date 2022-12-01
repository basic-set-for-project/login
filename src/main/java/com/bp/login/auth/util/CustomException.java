package com.bp.login.auth.util;

import com.bp.login.enm.ErrorCode;

public class CustomException extends RuntimeException{

    public ErrorCode getCode() {
        return code;
    }

    private final ErrorCode code;

    public CustomException(ErrorCode notFoundEvent) {
        super(notFoundEvent.getErrorMessage());
        this.code = notFoundEvent;
    }
}
