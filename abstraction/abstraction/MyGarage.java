package abstraction;

abstract class Bike {
	public abstract void ignite();
	
	public abstract void changeGear();
	
	public abstract void accelerate();

	public abstract void applyBrake();
	
}

abstract class SuperBike extends Bike{
	
}

 abstract class HayaBussa extends SuperBike{
	public void ignite() {
		System.out.println("HayaBuzza is ignite");
	}
	public void changeGear() {
		System.out.println("HayaBuzza is changeGear");
	}
//	public void accelerate() {
//		System.out.println("HayaBuzza is accelerate");
//	}
//	public void applyBrake() {
//		System.out.println("HayaBuzza is applyBreak");
//	}
}
	
 class HayaBuzza1 extends HayaBussa{

	@Override
	public void accelerate() {
		System.out.println("HayaBuzza1 Accelerate"); 
	}

	@Override
	public void applyBrake() {
		System.out.println("Hayabussa is applyBrake");
	}
	 
 }
class HayaBussa2 extends HayaBuzza1{
		//@Override
//		public void accelerate() {
//			System.out.println("HayaBussa is accelarate");
			//super.accelerate();
//		}
}

public class MyGarage {
	
	

	public static void main(String[] args) {
    Bike hb = new HayaBuzza1();
    hb.ignite();
    hb.accelerate(); 
    hb.changeGear();
    hb.applyBrake();
    System.out.println(" ");
   hb= new HayaBussa2();
   hb.ignite();
   hb.accelerate(); 
   hb.changeGear();
   hb.applyBrake();
	}

}
