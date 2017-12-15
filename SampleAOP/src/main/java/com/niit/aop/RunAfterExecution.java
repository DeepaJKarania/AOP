package com.niit.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RunAfterExecution {
	@After("execution(* com.niit.bean.MyBusinessService.runMyBusinessLogic(..))")
	public void runAfter(JoinPoint joinPoint) throws Throwable {

		System.out.println("Inside RunAfterExecution.afterReturning() method...");
		System.out.println("inserted after : " + joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "execution(* com.niit.bean.MyBusinessService.runMyBusinessLogic(..))", returning = "returnValue")
	public void runAfterReturning(JoinPoint joinPoint, String returnValue) throws Throwable {

		System.out.println("Inside RunAfterExecution.afterReturning() method...");
		System.out.println("inserted after : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + returnValue);
	}
}
