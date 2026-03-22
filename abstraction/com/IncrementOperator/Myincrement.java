package com.IncrementOperator;

public class Myincrement {


	public static void main(String[] args) {
		int x=100;
		int y=120;
       int z=(++x)+(--x)+(++y)+(y++)+(--y);
		// int c=(a++)+(++a)+(b++)+(++b);
		//int a=10;
		   // a++;
		  //++a;
		//int b=a++;
		    System.out.println(x);//100
		    System.out.println(y);//121
		    System.out.println(z);//564
		
		 //a=(byte)(a+1);
		  //a=(byte)(a+127);
		  //a=(byte) (a+129);
		  //System.out.println(a);
	}

}
