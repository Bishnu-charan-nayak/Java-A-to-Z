package MyEncap;

class printer {  // method overloding n number of methods same name change   
public void prnt1(int a) {
	System.out.print("inside print1 int");
}
public void print2(double a) {
	System.out.print("inside print2 double");
}
	public void print3(String a) {
		System.out.print("inside print3 String");
	}
		public void print4(int a,float b) {
			System.out.print("inside print4 int & float");
		}
			public void print5(String a , double b) {
				System.out.print("inside print5 String & double");
			}
				public void print6(int a , float b,int c) {
					System.out.print("inside print6 inside int, float,String");
				}
					public void print7(String a , float b,int c) {
						System.out.print("inside print2 double");
					}			
}
		
public class Printer{
					
					
	public static void main(String[] args) {
		
		Printer p= new Printer();
		        p.Print (10);
		        p.print(2.0);
		        p.print("Bishnu");
		        p.print(3.0);
		        p.print(2.0 );
	}

	private void Print(int i) {
		
	}

	private void print(double d) {
		
	}

	private void print(String string) {
		
	}
}


		
	



