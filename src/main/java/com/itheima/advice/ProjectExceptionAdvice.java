package com.itheima.advice;

import com.itheima.ex.BusinessException;
import com.itheima.ex.SystemException;
import com.itheima.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author zhang
 * @date 2022/05/04
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    /**
     * @param ex 其他异常
     * @return {@link String}
     */
    @ExceptionHandler(Exception.class)
    public Result handlerException(Exception ex) {
        System.out.println(ex.getMessage());
        return new Result("服务器繁忙，请稍后重试！");
    }

    /**
     * @param bs 业务异常
     * @return {@link String}
     */
    @ExceptionHandler(BusinessException.class)
    public Result handlerBusinessException(BusinessException bs) {
        System.out.println(bs.getMessage());
        return new Result("用户输入异常！");
    }

    @ExceptionHandler(SystemException.class)
    public Result handlerSystemException(SystemException ss) {
        System.out.println(ss.getMessage());
        return new Result("系统异常！");
    }
}
