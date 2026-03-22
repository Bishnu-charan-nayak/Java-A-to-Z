package finalKeyword;

//final class MyFinal {///Final class can't be extended ///final methodcan't be overriden but it will be inhertance
	      ///final class can'tbe inhertance'
class MyFinal {
	public void nonfinal()
	{
		System.out.println("inside nonfinal method");
	}
	public void m1() {
		System.out.println("m1() is a final method can't be overriden");
	}
	
//	public abstract final void m2() ;	
	
	//abstract->compulsory overide
   //Final can't be overriden
	
}

class MyChild extends MyFinal{
   public void nonfinal() {
	System.out.println("Overiding nonfinal in child class");
} 
//   @Override
//   public final void m1(){
//	   System.out.println("m1() is a final method can't be overriden");
//   }
//   
//   //final methods can't be override
}
public class MyExecution {

	public static void main(String[] args) {
//   MyChild c =new MyChild();
//           c.nonfinal();
//		final double A =100.01;///for final method it can't run i will be error
//		System.out.println(A);
//		A=100.09;
//		System.out.println(A);
		System.out.println(Math.PI);
		
	}

}
