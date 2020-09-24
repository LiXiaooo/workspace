package com.itmain.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){
        System.out.println("前置增强");
    }
    public void after(){
        System.out.println("后置增强");
    }
//    正在执行的连接点=切点
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("前面的环绕增强");
        Object proceed = pjp.proceed();
        System.out.println("后面的环绕增强");
        return proceed;
    }
    public void afterthrowing(){
        System.out.println("有异常");
    }
}
