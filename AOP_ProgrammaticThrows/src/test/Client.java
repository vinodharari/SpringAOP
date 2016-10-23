package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import services.LogForException;
import business.Bank;

public class Client {
		public static void main(String[] args) {
			Bank b = new Bank();
			LogForException lbs = new LogForException();
			
			ProxyFactoryBean pfb = new ProxyFactoryBean();
			pfb.setTarget(b);
			pfb.addAdvice(lbs);
			
			Bank bproxy=(Bank)pfb.getObject();
			int amount=bproxy.deposite("sbi13", 10000);
			System.out.println(amount);
		}
}
