package mymutabale;

public class MyStringBuffer {

	public static void main(String[] args) {
 
		 StringBuffer sb=new StringBuffer();
		 System.out.println(sb.capacity());
		 sb.append("JAVA");
		 System.out.println(sb);
		 sb.append("JAVASCRIPT");
		 System.out.println(sb);
		 sb.append("JAMESGOSLING");
		 System.out.println(sb);
		 System.out.println(sb.capacity());
		  sb.trimToSize();
		  System.out.println(sb.capacity());
	}

}
