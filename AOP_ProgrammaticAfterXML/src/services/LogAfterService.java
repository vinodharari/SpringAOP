package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import business.Bank;


public class LogAfterService implements AfterReturningAdvice{
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object ret) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("deposite method..."+arg0);
	}
}
