package com.itheima.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类增强
 * 记录方法执行时间
 *
 * @author zhang
 * @date 2022/05/04
 */
@Aspect
@Component
public class LogCostTime {
    /**
     * 执行service包下find开头方法所需要的时间
     */
    @Pointcut("execution(* com.itheima.service..*.select*(..))")
    public void pointCut() {
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //记录开始执行时的时间
        long start = System.currentTimeMillis();
        //执行环绕方法
        Object result = null;
        result = proceedingJoinPoint.proceed();
        //记录结束执行时的时间
        long end = System.currentTimeMillis();
        System.out.println("总时间：" + (end - start) + "ms");
        return result;
    }
}
