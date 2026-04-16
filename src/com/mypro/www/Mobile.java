//package com.mypro.www;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Mobile {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("sims.xml");
//		Airtel air = (Airtel) context.getBean("air");
//		air.calling();
//		air.data();
//		
//		Vodafone voda = (Vodafone) context.getBean("voda");
//		voda.calling();
//		voda.data();
//		
//		Jio jio = context.getBean("jio",Jio.class);
//		jio.calling();
//		jio.data();
//		
//		
//	}
//
//}
