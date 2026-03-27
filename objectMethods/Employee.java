package objectMethods;

class Employee1 {
    int empId;
    String empName;
    double empSalary;
    String empCity;

    @Override
    public String toString() {
        return "Employee [empId=" + empId + 
               ", empName=" + empName + 
               ", empSalary=" + empSalary + 
               ", empCity=" + empCity + "]";
    }
}
//class Employee2{
//    public String toString1() {
//        return "Employee [empId=" + empId + 
//               ", empName=" + empName + 
//               ", empSalary=" + empSalary + 
//               ", empCity=" + empCity + "]";
//}

public class Employee{
	public static void main(String[] args) {

        Employee1 e = new Employee1();

        e.empId = 860;
        e.empName = "Bishnu";
        e.empSalary = 50000.0;
        e.empCity = "Rourkela";
        
        Employee1 e1 = new Employee1();

        e1.empId = 860;
        e1.empName = "Bishnu";
        e1.empSalary = 50000.0;
        e1.empCity = "Rourkela";


//        System.out.println(e.toString());
        System.out.println(e==e1);        //Referance check false
       System.out.println(e.equals(e1));  //value check
       System.out.println(e.hashCode());
       System.out.println(e1.hashCode());
    }
}