package com.Method;

public class Myatm {
	   String name ;
	   String sensore;
	   String depositamount ;
 
	  public void deposit (double amount){
		 System.out.println( "amount"+"Credited to your account" );
	  }
	  public void withdraw(double amount) {
		  System.out.println("amount"+"Dabited to your account");
	  }
	  public void checkbalance(double amount) {
	  }
	  
	public static void main(String[] args) {
		 Myatm myatm = new Myatm();
		       myatm.name="SBI";
		       myatm.sensore="3";
		       myatm.depositamount="double";
		       System.out.println( myatm.name);
		       
	}
	            
}
