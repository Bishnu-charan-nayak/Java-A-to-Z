package myAbstraction;

 class Plane2 {

	public void takeoff() {
			System.out.println("Plane is taking off");
	}
	public void fly() {
		System.out.println("Plane flyies at medium height");
	}

	public void land() {
		System.out.println("Plane is landing");
	}
}
    class CargoPlane extends Plane2{
	 public void takeoff() {
			System.out.println("CargoPlane is taking off");
	}
	public void fly() {
		System.out.println("CargoPlane flyies at medium height");
	}

	public void land() {
		System.out.println("CargoPlane is landing");
 }
	class PassengerPlane extends Plane2 {

		public void takeoff() {
			System.out.println("Passenger Plane is taking off");
	}
	public void fly() {
		System.out.println("Passenger Plane flyies at medium height");
	}

	public void land() {
		System.out.println("PassengerPlane is landing");
	    }
	} 
	class FighterPlane extends Plane2 {
		public void takeoff() {
			System.out.println("FighterPlane is taking off");
	}
	public void fly() {
		System.out.println("FighterPlane flyies at medium height");
	}

	public void land() {
		System.out.println("FighterPlane is landing");
	}
	}
	
	public class MyPlane2{
		public static void main(String[] args) {
//          Plane2 p=new Plane2();
//                p.fly();
//                p.land();
			CargoPlane cp=new CargoPlane();
			
                
	}

	}}
