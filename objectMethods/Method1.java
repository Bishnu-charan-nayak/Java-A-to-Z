package objectMethods;

public class Method1 {
	public static void main(String[] args) {

		String s= "ROO$MAN";
		String t="";
		for (int i=0; i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
			t=t+(char)( s.charAt(i)+32);
			}
			
		else {
			t=t+s.charAt(i);
			//System.out.println(t);
		}
			System.out.println(t);
		}
	}

}
