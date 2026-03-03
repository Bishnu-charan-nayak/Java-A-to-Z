package constroctors;

 class Bike {
String name;
double mileage;
int model;
	public Bike (String name) {
		this();
		this.name=name;
		System.out.println("inside name construe");
	}
	public Bike(double mileage) {
		this.mileage=mileage;
		System.out.println("inside milage construe");
	}
	public Bike () {
		this(2026);
		System.out.println("inside defult construe");
		
	}
	public Bike(int model) {
		this(30.0);
		model=model;
		System.out.println("inside model construe");
	}
	String getName() {
		return name; }
	double getmileage() {
		return mileage; }
    int getModel() {
		return model; }
 
 }
 public class Servicepoint{
	 public static void main(String[] args) {
		Bike b=new Bike("Bullet");
		System.out.println(b.getName());
	}
 }