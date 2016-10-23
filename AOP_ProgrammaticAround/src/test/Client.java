package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import services.LogAroundService;
import business.Bank;

public class Client {
		public static void main(String[] args) {
			Bank b = new Bank();
			LogAroundService lbs = new LogAroundService();
			
			ProxyFactoryBean pfb = new ProxyFactoryBean();
			pfb.setTarget(b);
			pfb.addAdvice(lbs);
			
			Bank bproxy=(Bank)pfb.getObject();
			int amount=bproxy.deposite("sbi123", 10000);
			System.out.println(amount);
		}
}
