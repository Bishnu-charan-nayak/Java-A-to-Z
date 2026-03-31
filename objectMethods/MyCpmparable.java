package objectMethods;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Student1 implements Comparable<Student1> {
	String name;

	public String getName() {
		return name;
	}

	public Student1(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return -this.getName().compareTo(o.getName());
	}

}

public class MyCpmparable {

	public static void main(String[] args) {
//		HashSet<Student> hs = new HashSet<>();
//		
//		hs.add(new Student("Nabin"));
//		hs.add(new Student("Aman"));
//		hs.add(new Student("Bishnu"));
//		hs.add(new Student("Chinamay"));
//		hs.add(new Student("Omm"));
//		
//		System.out.println(hs);
//		
//		LinkedHashSet<Student> lhs = new LinkedHashSet<>();
//		
//		lhs.add(new Student("Nabin"));
//		lhs.add(new Student("Aman"));
//		lhs.add(new Student("Bishnu"));
//		lhs.add(new Student("Chinamay"));
//		lhs.add(new Student("Omm"));
//		
//		System.out.println(lhs);

		TreeSet<Student1> ths = new TreeSet<>();

		ths.add(new Student1("Aman "));
		ths.add(new Student1("Bishnu"));
		ths.add(new Student1("Chinamay"));
		ths.add(new Student1("Nabin"));
		ths.add(new Student1("Omm"));

		System.out.println(ths);

	}
}
