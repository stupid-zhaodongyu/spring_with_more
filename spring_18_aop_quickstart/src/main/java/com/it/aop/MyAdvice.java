package com.it.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
//    @Pointcut("execution(void com.it.dao.BookDao.update())")
//    @Pointcut("execution(void com.it.dao.impl.BookDaoImpl.update())")
//    @Pointcut("execution(void com.*.*.impl.BookDaoImpl.update())")
//    @Pointcut("execution(void com.*..update())")
    @Pointcut("execution(* *..*e())")
    private void pc(){

    }
    @Before("pc()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
