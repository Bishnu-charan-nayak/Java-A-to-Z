package inheritance;

class Plane {

	Plane() {
		
	}

	public void takeoff() {
		System.out.println("Plane is taking off");
	}

	public void fly() {
		System.out.println("Plane flies at medium height");
	}

	public void land() {
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane {
	public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }
	public void CarryArmory() {
		System.out.println("Plane carries cargoes");
	}
}

class PassengerPlane extends Plane {

    public void fly() {
        System.out.println("PassengerPlane flies at lower height");
    }
}

// Child Class 2
class FighterPlane extends Plane {

    @Override
    public void fly() {
        System.out.println("FighterPlane flyies at very high ");
    }
    public void carryArms() {
    	System.out.println();
    }
}
  class Airport{
	  public static void permit (Plane p) {
		  System.out.println("Airport allowine the planes inside permit");
		  
		  p.takeoff();
		  p.fly();
		  p.land();
	  }
  }

public class Myjets {

    public static void main(String[] args) {
    	
    	CargoPlane cp=new CargoPlane();
    	PassengerPlane pp = new PassengerPlane();
    	FighterPlane fp = new FighterPlane();
    	
    	
    Airport.permit(cp);
    Airport.permit(pp);
    Airport.permit(fp);
    
    	
//    	Plane p;
//    	CargoPlane cp=new CargoPlane();
//    	p=cp;
//    	p.fly();
//        ((CargoPlane) p).CarryArmory();
//        System.out.println();
//    	PassengerPlane pp=new PassengerPlane();
//    	p=pp;
//    	p.fly();
//    	System.out.println();
//    	FighterPlane fp=new FighterPlane();
//    	p=fp;
//    	p.fly();

        // Polymorphism (Parent reference)
//        Plane p1 = new PassengerPlane();
//        Plane p2 = new FighterPlane();

//        p1.takeoff();
//        p1.fly();
//        p1.land();
//        System.out.println("\nPassenger Plane:");
//
//        System.out.println("\nFighter Plane:");
//        p2.takeoff();
//        p2.fly();
//        p2.land();
    }
}