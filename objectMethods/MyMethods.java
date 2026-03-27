package objectMethods;

class Student
{
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class MyMethods {
public static void main(String[] args) {
	
	Student s = new Student();
	
	s.name="Bishnu";
	s.age=21;
	
	System.out.println(s.toString());
}
}