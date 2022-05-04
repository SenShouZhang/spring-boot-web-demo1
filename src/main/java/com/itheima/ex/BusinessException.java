package com.itheima.ex;

/**
 * 业务异常
 * 由用户导致
 *
 * @author zhang
 * @date 2022/05/04
 */
public class BusinessException extends RuntimeException {
    private String msg;

    public BusinessException(String message) {
        super(message);
        this.msg = message;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }
}
