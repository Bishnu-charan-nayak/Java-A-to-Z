package interface1;
interface ATM {
//	public static final int a=1;///final use for constance
   public void withdraw();///if it will be remove abstract it will be work 
	public abstract void deposite();
}

class SBI implements ATM{
	@Override
	public void withdraw() {
		System.out.println("SBI ATM can be Withdraw money");
	}
	public void deposite () {
		System.out.println("SBI ATM can Deposite money");
	}
	public void spicialRoi() {
System.out.println("SBI offer 85% ROI");
	}
}
 class Canara implements ATM{
	 public void withdraw() {
			System.out.println("Canara ATM can be Withdraw money");
		}
		public void deposite () {
			System.out.println("Canara ATM can Deposite money");
		}
 }
 class Axis implements ATM{
	 public void withdraw() {
			System.out.println("Axis ATM can be Withdraw money");
		}
		public void deposite () {
			System.out.println("Axis ATM can Deposite money");
		}
 }
 class PlutoneMall {
	 public static void getinstalled(ATM a) {
		 a.deposite();
		 a.withdraw();
	 }
 }
public class MyBank {

 public static void main(String[] args) {
	// ATM =new.ATM/// Object of interface
	   ATM a=new SBI();
       SBI sb=new SBI();
       Canara ca = new Canara();
       Axis ax = new Axis();
      // PlutoneMall.getinstalled(ax);
            a.deposite();
            a.withdraw();
            System.out.println("");
            sb.deposite();
            sb.withdraw();
            System.out.println("");
            PlutoneMall.getinstalled(sb);
            System.out.println("");
            ca.deposite();
            ca.withdraw();
            System.out.println("");
            ax.deposite();
            ax.withdraw();
	 
	}

}
