package com.mypro.www;

public class Mobile1 {
	
	private Sim s;
	
	public Mobile1(Sim s) {

		this.s=s;
	}
	public void feature() {

		System.out.println("Sim selected is "+ s);
		s.calling();
		s.data();
	}

}
