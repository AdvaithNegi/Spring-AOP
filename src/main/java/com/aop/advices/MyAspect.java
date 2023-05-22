package com.aop.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// * works for all access modifier
	// If there is a argument in a method then we need to use 2 dots i.e. (..)

	@Before("execution(* com.aop.service.PaymentServiceImplementation.makePayment(..))")
	public void authorizeUser() {
		System.out.println("Authorization implemented....");
	}

	@After("execution(* com.aop.service.PaymentServiceImplementation.makePayment(..))")
	public void authorizedUser() {
		System.out.println("Authorization Ended....");
	}

}
