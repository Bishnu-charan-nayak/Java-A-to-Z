package com.mypro.www;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sims.xml");
		
		Airtel air = (Airtel) context.getBean("air");
		Mobile1 mob = context.getBean("mo",Mobile1.class);
		mob.feature();
		
  		
		Jio jio = context.getBean("jio",Jio.class);
		
		
	}

}
