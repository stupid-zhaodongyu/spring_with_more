package com.it.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.it.dao.BookDao.findName(..))")
    private void pc(){

    }
//    @Before("pc()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice");
    }

//    @After("pc()")
    public void after(){
        System.out.println("after advice");
    }

//    @Around("pc()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 50;
        Object re = proceedingJoinPoint.proceed(args);
        return re;
    }

//    @AfterReturning(value = "pc()", returning = "re")
    public void afterReturning(Object re){
        System.out.println("after returning     " + re);
    }
    @AfterThrowing(value = "pc()", throwing = "re")
    public void afterThrowing(Throwable re){
        System.out.println("after afterThrowing");
    }
}
