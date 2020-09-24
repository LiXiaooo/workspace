package com.itmain.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {
    @Before("execution(* com.itmain.anno.*.*())")
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
