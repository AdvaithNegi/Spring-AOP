package com.aop.spring_aspect_oriented_programming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		PaymentService paymentService = (PaymentService) applicationContext.getBean("payment");
		paymentService.makePayment(21);

	}
}
