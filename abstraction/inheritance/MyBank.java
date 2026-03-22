package inheritance;

    class Bank {

	public void roi() {
		System.out.println("6.5%");
	}
	public static void withdraw () {
		System.out.println("Bank allow to withdraw");
	}
    }
	class Sbi extends   Bank {
		public void roi() {
			System.out.println("8.5%");
		}
	}
    
public class MyBank
{
	public static void main(String[] args) {
		Sbi s =new Sbi();
            s.roi();
            Sbi.withdraw();
	}

}
