package inheritance;
	  
 class GrandParent
 {
	 public void read()
	 {
		 System.out.println("You are GrandParent ");
	 }
 }
 class MyPareant extends GrandParent
 {
	 public void write()
	 {
		 System.out.println("You are preant class");
	 }
 }
 class Child extends MyPareant
 {
	 
 }

