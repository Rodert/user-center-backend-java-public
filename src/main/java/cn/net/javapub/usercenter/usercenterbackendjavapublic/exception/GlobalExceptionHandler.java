package cn.net.javapub.usercenter.usercenterbackendjavapublic.exception;

import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.BaseResponse;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ErrCode;
import cn.net.javapub.usercenter.usercenterbackendjavapublic.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    public BaseResponse<?> handleBusinessException(BusinessException e) {
        log.error(e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMsg());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public BaseResponse<?> runtimeException(RuntimeException e) {
        log.error(e.getMessage(), e);
        return ResultUtils.error(ErrCode.SYSTEM_ERROR, e.getMessage());
    }
}
