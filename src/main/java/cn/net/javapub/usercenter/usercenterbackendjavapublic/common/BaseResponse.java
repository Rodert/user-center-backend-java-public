package cn.net.javapub.usercenter.usercenterbackendjavapublic.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int code; // 状态码
    private String message; // 描述
    private T data; // 数据

    public BaseResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResponse(int code, T data) {
        this(code, "", data);
    }

    public BaseResponse(ErrCode errCode) {
        this(errCode.getCode(), errCode.getMessage(), null);
    }
}
