package services;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import business.Bank;


public class LogAroundService implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("before deposite method");
		Object ret = mi.proceed();
		l.info("after deposite method");
		return ret;
	}
}
