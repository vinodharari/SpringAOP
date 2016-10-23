package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import business.Bank;


public class LogBeforeService implements MethodBeforeAdvice{
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		Log l = LogFactory.getLog(Bank.class);
		l.info("deposite method : "+arg0.toString()+"  "+arg1[0].toString());
	}
}
