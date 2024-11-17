package cn.net.javapub.usercenter.usercenterbackendjavapublic.common;

public class ResultUtils {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(200, "success", data);
    }

    public static <T> BaseResponse<T> error(ErrCode errCode) {
        return new BaseResponse<>(errCode);
    }

    public static <T> BaseResponse<T> error(ErrCode errCode, String msg) {
        return new BaseResponse<>(errCode.getCode(), msg, null);
    }

    public static <T> BaseResponse<T> error(int code, String msg) {
        return new BaseResponse<>(code, msg, null);
    }
}
