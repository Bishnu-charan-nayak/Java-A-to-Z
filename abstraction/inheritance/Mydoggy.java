package inheritance;

class Dog {
	String name;
	int cost;
	String breed = "German shepard";

	public Dog(String Name) {
		System.out.println("Include the Name constructor");
		this.name = name;
	}

	public Dog(int cost) {
		// super();//
		this("rubby");// pass construct parameter
		System.out.println("inside the cost constructor");
		this.cost = cost;
	}

	public Dog(String Name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public Dog() {
		this(10000);
		System.out.println("Dog object created");
	}

	public void bark() {
		System.out.println("dog is barking");
	}
}

class Puppy extends Dog {
	public Puppy() {
		super();
		System.out.println("puppy object created");
	}

//@override
	public void bark() {
		System.out.println("puppy barks in low voice");
	}
}

public class Mydoggy {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.bark();
		System.out.println(p.breed);

	}
}
