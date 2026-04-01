package myFuninterface;

interface square{
	int square (int a);
}
public class Mymain10 {
	public static void main(String[] args) {
        square s=(int a)->a*a;
        int res=s.square(10);
        System.out.println("Reasult "+res);
		
	}

}
