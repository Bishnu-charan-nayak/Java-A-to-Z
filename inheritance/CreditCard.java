package inheritance;

  class Card {

	public void CreditLimite() {
		System.out.println("Credit limite 50,000");
	}
}
class HDFCCard extends Card{
	public void CreditLimite() { 
		System.out.println("inside HDFC card credit limite()");
	}
}
public class CreditCard {
	public static void main(String[] args) {
		  Card c=new Card ();
		 
	}
}
  c
