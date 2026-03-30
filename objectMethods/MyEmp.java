package objectMethods;
import java.util.Comparator;
import java.util.TreeSet;

 class Employee5 implements Comparable<Employee5>{
	String name;
	int age;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public Employee5(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee5 o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
//	@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return Integer.compare(this.age, o.age);
//	}

}
 
 class AgeComparator implements Comparator<Employee5>
 {

	@Override
	public int compare(Employee5 o1, Employee5 o2) {
		// TODO Auto-generated method stub
		return -Integer.compare(o1.age, o2.age);
	}
	 
 }

public class MyEmp {
	public static void main(String[] args) {
		AgeComparator ageComparator = new AgeComparator();
		TreeSet<Employee5> emp = new TreeSet<Employee5>(ageComparator);
		emp.add(new Employee5("Nabin", 22));
		emp.add(new Employee5("Aman", 21));
		emp.add(new Employee5("Omm", 24));
		emp.add(new Employee5("Bishnu", 23));
		emp.add(new Employee5("Chinmaya", 25));
		System.out.println(emp);
		
//		System.out.println("Treeset Sorting based on Age");
		
	}
}