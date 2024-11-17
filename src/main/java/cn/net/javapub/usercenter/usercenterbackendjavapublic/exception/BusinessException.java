package cn.net.javapub.usercenter.usercenterbackendjavapublic.exception;

import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ErrCode;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private final int code;
    private final String msg;

    public BusinessException(ErrCode errCode) {
        this.code = errCode.getCode();
        this.msg = errCode.getMessage();
    }

    public BusinessException(ErrCode errCode, String message) {
        this.code = errCode.getCode();
        this.msg = message;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
