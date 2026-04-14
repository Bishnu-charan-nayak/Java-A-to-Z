package programs; 

class Mychar {

	public static  void Print1() {
		String t="";
		for(char i=65;i<=75;i++) {
			t=t+i;
			System.out.println(t);
		}
	}
}
public class MyPrint1{ 
	public static void main(String[] args) {
       Mychar.Print1();
	}

}
