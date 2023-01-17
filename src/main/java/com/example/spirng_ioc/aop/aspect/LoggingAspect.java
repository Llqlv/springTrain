package com.example.spirng_ioc.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    /*@Pointcut("execution (* com.example.spirng_ioc.aop.Library.*(..) )")
    private void allMethodsFromLibrary() {}

    @Pointcut("execution(public void com.example.spirng_ioc.aop.Library.returnMagazine())")
    private void returnMagazineFromLibrary() {}

    @Pointcut("allMethodsFromLibrary() && !returnMagazineFromLibrary()")
    private void allMethodsExceptReturnMagazine() {}

    @Before("allMethodsExceptReturnMagazine()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }*/


    /*@Pointcut("execution (* com.example.spirng_ioc.aop.Library.get*())")
    private void allGetMethodsFromLibrary() {}

    @Before("allGetMethodsFromLibrary()")
    public void beforeLoggingAdvice() {
        System.out.println("beforeLoggingAdvice: writing Log #1");
    }

    @Pointcut("execution (* com.example.spirng_ioc.aop.Library.return*())")
    private void allReturnMethodsFromLibrary() {}

    @Before("allReturnMethodsFromLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeLoggingAdvice: writing Log #2");
    }

    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()")
    private void allGetAndReturnMethodsFromLibrary() {}

    @Before("allGetAndReturnMethodsFromLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }*/

    @Pointcut("execution(* get*() )")
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: trying Logging and trying getting book/magazine");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: trying check security level on getting book/magazine");
    }

    

}