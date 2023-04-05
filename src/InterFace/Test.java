package InterFace;

public class Test {

	public static void main(String[] args) {
		
		HsbBank bs = new HsbBank(); // Compile time Polymorfism
//		
//		bs.credit();
//		bs.debit();
//		bs.transferMoney();
//		bs.educationLoan();
//		bs.CarLoan();
//		bs.matualFunds();
		
		
		//Dynamic Polymorphism
		// clild class object can be refered by Perent Interface reference variable
		
//		  UsBank us = new HsbBank();
//		  us.credit();
//		  us.debit();
//		  us.transferMoney();
		
		iciciBank ic = new HsbBank();
		ic.matualFunds();
		System.out.println(UsBank.sal);
//		  

	}

}
