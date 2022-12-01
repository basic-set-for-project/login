package com.bp.login.auth.util;

import com.bp.login.enm.ErrorCode;

public class EmptyTokenException extends CustomException {
    public EmptyTokenException(ErrorCode notFoundEvent) {
        super(notFoundEvent);
    }
}
