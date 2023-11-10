package cn.net.javapub.project.usercenterbackendjavapublic.model.common;

import cn.net.javapub.project.usercenterbackendjavapublic.constant.enums.ResultCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BizException extends RuntimeException {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    public BizException() {
        super();
    }

    public BizException(ResultCode resultCode) {
        super(resultCode.message());
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public BizException(ResultCode resultCode, Throwable cause) {
        super(resultCode.message(), cause);
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public BizException(String message) {
        super(message);
        this.code = -1;
        this.message = message;
    }

    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BizException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
