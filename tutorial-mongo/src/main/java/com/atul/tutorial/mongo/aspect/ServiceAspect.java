package com.atul.tutorial.mongo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAspect {
	
	
	
	public static Logger LOGGER=LoggerFactory.getLogger(ServiceAspect.class);
	
	@Before("execution(* com.atul.tutorial.mongo.service.*.*(..))")
	public void beforeService(JoinPoint joinPoint){
		LOGGER.debug("Start of "+joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.atul.tutorial.mongo.service.*.*(..))")
	public void afterService(JoinPoint joinPoint){
		LOGGER.debug("End of "+joinPoint.getSignature().getName());
	}
	
	
	
	

}
