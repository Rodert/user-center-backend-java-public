package cn.net.javapub.project.usercenterbackendjavapublic.demos.exception;


import cn.net.javapub.project.usercenterbackendjavapublic.demos.common.ErrorCode;

/**
 * 自定义异常类
 *
 * @author <a href="https://github.com/Rodert">JavaPub</a>
 * @from <a href="http://javapub.net.cn">编程指南</a>
 */
public class BusinessException extends RuntimeException {

    /**
     * 异常码
     */
    private final int code;

    /**
     * 描述
     */
    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }


    public String getDescription() {
        return description;
    }
}
