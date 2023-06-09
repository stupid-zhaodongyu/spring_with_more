package com.it.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(boolean com.it.service.ResourcesService.openURL(..))")
    private void servicePc(){
    }
    @Around("MyAdvice.servicePc()")
    public Object trimStr(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
           if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }
        Object ret = proceedingJoinPoint.proceed(args);
        return ret;
    }
}
