package aggregation;

class Charger {

	private String brand;
	private double voltage;

	public Charger(String brand, double voltage) {

		this.brand = brand;
		this.voltage = voltage;

	}

	public String getBrand() {
		return brand;
	}

	public double getVoltage() {
		return voltage;
	}

}

class OS {

	private String name;
	private int size;

	public OS(String name, int size) {

		this.name = name;
		this.size = size;

	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

}

class Mobile {

	OS o = new OS("Andriod", 2);

	void hasA(Charger c) {

		System.out.println("Accessing Charger inside the Mobile");
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());

	}

}

public class Mymain {
	public static void main(String[] args) {

		Charger c = new Charger("Samsung", 4.5);
		Mobile m = new Mobile();
		m = null;
//		m.hasA(c);
//		System.out.println(m.o.getName());    ///Mobile and OS is tightely bounded(When mobile is theaf OS also theaf)
//		System.out.println(m.o.getSize());    

		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());    ///Hear Still Charger is working

	}

}
