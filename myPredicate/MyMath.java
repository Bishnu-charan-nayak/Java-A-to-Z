package myPredicate;
public class MyMath {
	public static void main(String[] args) {
		String otp="";
		for(int i=1;i<=6;i++) {
			otp=otp+(int)(Math.random()*10); 
//			System.out.print((int)(Math.random()*10));
		}

		System.out.println(otp);
	}

}
