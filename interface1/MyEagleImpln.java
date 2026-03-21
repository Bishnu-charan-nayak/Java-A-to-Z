package interface1;

interface Bird{
	public abstract void fly();
	public abstract void eat();
}
abstract class Eagle implements Bird {

	@Override
	public void fly() {
   System.out.println("Eagle fly incritable Height");		
	}

	@Override
	public abstract void eat();
	
}
class GoldenEagle extends Eagle {
	public void fly() {
   System.out.println("GoldenEagle fly incritable Height");		
	}

	public void eat() {

		System.out.println("GoldenEagle feeds Fish");
	}
}
class SerpentEagle extends Eagle{
	public void fly() {
		   System.out.println("SerpentEagle fly incritable Height");		
			}

			public void eat() {

				System.out.println("Eagle feeds snakes");
			}
}

public class MyEagleImpln {

	public static void main(String[] args) {
         Eagle e=new GoldenEagle();
               e.eat();
               e.fly();
               System.out.println("");
         SerpentEagle se=new SerpentEagle();
                      se.fly();
                      se.eat();
	}

}
