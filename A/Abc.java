package A;//Acces modifire
public class Abc {   //class can be modifire by public,package
	private int a;
	        int b;
	protected int c;
	public int d;
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
class Efg extends Abc{
	@Override
	public void m1() {
		//method can be modifire by public,default,protected,private
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}