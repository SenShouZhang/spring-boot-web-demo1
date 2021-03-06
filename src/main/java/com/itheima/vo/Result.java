package com.itheima.vo;

import lombok.Data;

/**
 * θΏεη»ζ
 *
 * @author zhang
 * @date 2022/05/02
 */
@Data
public class Result implements java.io.Serializable {
    private boolean flag;
    private String message;
    private Object result;

    public Result(String message) {
        this.message = message;
    }

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag, String message, Object result) {
        this.flag = flag;
        this.message = message;
        this.result = result;
    }
}
