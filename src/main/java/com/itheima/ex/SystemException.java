package com.itheima.ex;

/**
 * 系统异常
 *
 * @author zhang
 * @date 2022/05/04
 */
public class SystemException extends RuntimeException {
    private String msg;

    public SystemException(String message) {
        super(message);
        this.msg = message;
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
        this.msg = message;
    }

    public String getMsg() {
        return msg;
    }
}
