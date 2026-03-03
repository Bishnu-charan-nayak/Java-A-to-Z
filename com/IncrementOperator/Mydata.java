package com.IncrementOperator;

public class Mydata {
	
	public static void main(String[] args) {
     int a=45;
     int b=045;
     int c=0x45;
     int d=0b11000;
     System.out.println(a);//45
     System.out.println(b);//37
     System.out.println(c);//0
     System.out.println(d);//24
	}
	

}
//use0b compile consider as a binary number
//Namber having 0x  as prefix init is consider Hexadecimal
//Namber having 0 as prefix init is consider octal 