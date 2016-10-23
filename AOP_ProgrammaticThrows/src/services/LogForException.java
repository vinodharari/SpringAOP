package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
//import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import business.Bank;


public class LogForException implements ThrowsAdvice{
	
	@SuppressWarnings("unused")
	private void AfterThrowing(Exception ex) {
		Log l = LogFactory.getLog(Bank.class);
		l.info("exception deposite method..."+ex.getMessage());
	}
}
