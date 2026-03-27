package mySetinterface;
import java.util.HashSet;
import java.util.Iterator;

class Student{
	String name;
	public Student(String name) {
		this.name=name;
		
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
		public class MyHashSet2 {
			public static void main(String[] args) {

				HashSet<Student> hs =new HashSet <>();
				hs.add(new Student("Bishnu"));
				hs.add(new Student("Nabin"));
				hs.add(new Student("Omm"));
				hs.add(new Student("Chinu"));
				hs.add(new Student("Aman"));
				hs.add(new Student("Null"));
				System.out.println(hs);
				
				Iterator<Student> itr = hs.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
			}

		}

		//If same Object hascode not be equall
//		1. Hash Set:  
//			• It uses the backend data structure called as Hash Table. 
//			(Data is stored as Key-value pair). 
//			• Hash set was introduced in JDK 1.4version. 
//			• Duplicates are not allowed. 
//			• Insertion order is not preserved. 
//			• Null value is accepted. 
//			• Initial capacity is 16. 
//			• Load factor is 0.75. 
//			• New capacity = old capacity*2.
//		