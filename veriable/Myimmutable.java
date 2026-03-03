package veriable;

public class Myimmutable {

	public static void main(String[] args) {
     // String s1 ="Rooman";
      //System.out.println(s1);
      //System.out.println(s1.concat("Technology"));
//      System.out.println(s1.concat("Pvt.ltd"));
      //System.out.println(s1);
     
		
	      String s1 ="Rooman";//s1> Rooman Technologies;
	      System.out.println(s1.concat ("Technologies"));
	      System.out.println(s1);//Rooman no change
	      StringBuffer  s2 = new StringBuffer(s1);
	      s2.append("Technogy");
	      s1=s2.toString();
	      System.out.println(s1);

	}

}
