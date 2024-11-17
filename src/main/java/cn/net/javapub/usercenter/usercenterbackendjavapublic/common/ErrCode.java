package cn.net.javapub.usercenter.usercenterbackendjavapublic.common;

public enum ErrCode {

    SUCCESS(200, "ok"),
    PARAM_ERROR(4000, "请求参数错误"),
    SYSTEM_ERROR(4001, "系统错误");


    private final int code; // 状态码
    private final String message; // 状态信息

    ErrCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
