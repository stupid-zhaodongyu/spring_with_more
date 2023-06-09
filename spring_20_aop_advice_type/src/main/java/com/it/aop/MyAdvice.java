package com.it.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.it.dao.BookDao.update())")
    private void pc(){

    }
    @Pointcut("execution(int com.it.dao.BookDao.select())")
    private void pc2(){

    }
//    @Before("pc()")
    public void before(){
        System.out.println("before advice");
    }
//    @After("pc()")
    public void after(){
        System.out.println("after advice");
    }
    @Around("pc()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice");
        /*表示对原始操作的调用*/
        proceedingJoinPoint.proceed();
        System.out.println("around after advice");
    }

    @Around("pc2()")
    public int around2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before advice");
        /*表示对原始操作的调用*/
        Integer re = (Integer) proceedingJoinPoint.proceed();
        System.out.println("around after advice");
        return 200;
    }
//    @AfterReturning("pc2()")
    public void afterReturning(){
        System.out.println("after returning");
    }
    @AfterThrowing("pc2()")
    public void afterThrowing(){
        System.out.println("after afterThrowing");
    }
}
