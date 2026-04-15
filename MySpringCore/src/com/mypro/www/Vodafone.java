package com.mypro.www;

public class Vodafone implements Sim {
	
	public void calling(){
		System.out.println("Vodafone calling");
		
	}
	@Override
	public void data() {

		System.out.println("Vodafone Data");
	}

}
