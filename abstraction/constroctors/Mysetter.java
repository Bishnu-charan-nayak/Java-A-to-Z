package constroctors;

 class Auto {
   String name;
   public Auto(String name)
   {
	   this.name=name;
   }
		public void setName(String name)
		{
			this.name=name;
		}
	public String getName()
	{
		return name;
	}

}
 public class Mysetter{
	 public static void main(String[] args) {
		Auto a=new Auto("Bajaj");
		a.setName("Tata");
		System.out.println(a.name);
	}
 }
