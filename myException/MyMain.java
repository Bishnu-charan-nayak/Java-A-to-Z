package myException;

class MyError {
	public void m3() {
		m3();
	}
}
public class MyMain {
	
	public static void main(String[] args) {
  
		MyError m = new MyError ();
		  m.m3();
//		  main(args);
	}

}
