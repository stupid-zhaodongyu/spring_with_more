package com.it.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    /*匹配业务层的所有方法*/
    @Pointcut("execution(* com.it.service.*Service.*(..))")
    private void servicePc(){}


    @Around("ProjectAdvice.servicePc()")
    public void runSpeed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        Long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
             proceedingJoinPoint.proceed();
        }
        Long end = System.currentTimeMillis();
        System.out.println(signature.getDeclaringType() + signature.getName() +  (end-start));
    }

}
