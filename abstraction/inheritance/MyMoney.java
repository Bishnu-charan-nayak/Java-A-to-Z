package inheritance;

import inheritance.AXIS.Permission;

class ATM {

	public void Deposite() {
		System.out.println("Atm can Deposite Money");
	}
	public void Withdraw() {
		 System.out.println("ATM can WithDraw Money");
	}
	public void CheckBlance() {
		System.out.println("ATM can Check Balance");
	}
}
	
	class SBI extends ATM {
		public void Deposite() {
			System.out.println("SBI can Deposite Money");
		}
		public void Withdraw() {
			 System.out.println("SBI can WithDraw Money");
		}
		public void CheckBlance() {
			System.out.println("SBI can Check Balance");
		}
	}
	class ICICI extends ATM{
		public void Deposite() {
			System.out.println("ICICI can Deposite Money");
		}
		public void Withdraw() {
			 System.out.println("ICICI can WithDraw Money");
		}
		public void CheckBlance() {
			System.out.println("ICICI can Check Balance");
		}
		
	}
 class AXIS extends ATM{
	 public void Deposite() {
			System.out.println("AXIS can Deposite Money");
		}
		public void Withdraw() {
			 System.out.println("AXIS can WithDraw Money");
		}
		public void CheckBlance() {
			System.out.println("AXIS can Check Balance");
		}
	class Permission{
			public static void Acces(ATM a){
				System.out.println("All ATM Can do All thing");
				a.Deposite();
				a.Withdraw();
				a.CheckBlance();
			}
		}
	
}
public class MyMoney{
	public static void main(String[] args) {
		SBI s=new SBI();
		AXIS ax=new AXIS();
		ICICI i =new ICICI();
		
		Permission.Acces(ax);
		System.out.println();
		Permission.Acces(s);
		System.out.println();
		Permission.Acces(i);
		
	}
}
 
 
 
