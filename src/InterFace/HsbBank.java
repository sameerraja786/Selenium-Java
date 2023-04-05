package InterFace;

public class HsbBank implements UsBank,iciciBank {

	
		public void credit()
		{
			System.out.println("This is the credit Method");
		}
		public void debit()
		{
			System.out.println("This is the debit Method");
		}
		public void transferMoney()
		{
			System.out.println("This is the transferMoney Method");
		}
		
		public void educationLoan()
		{
			System.out.println("This is the EducationLoan Method");
		}
		public void CarLoan()
		{
			System.out.println("This is the CarLoan Method");
		}
		public void matualFunds()
		{
			System.out.println("This is the Matual funds Method");
		}
	}


