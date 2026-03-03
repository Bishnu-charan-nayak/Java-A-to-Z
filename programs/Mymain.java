package programs;

 class MyParent {

	public void m1() {
		System.out.println("MyParent method m1()");
	}
	public void m2() {
		System.out.println("MyParent method m2()");
	}
 }
	class MyChild extends MyParent{
		@Override
		public void m2() {
			System.out.println("MyChild method m2()");
			super.m2();
		}
	}
	public class Mymain {
		public static void main(String[] args) {
			MyChild m=new MyChild();
			    m.m2();
		}
	}

