package bank;
public class GeorgeBank extends Cust_Acc implements Bank{

	@Override
	public void interestRate_HomeLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interestRate_CarLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interestRate_PersonalLoan() {
		System.out.println("Interest Rate for personal Loan is 13% pa");
		
	}

	@Override
	public void interestRate_EducationLoan() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		GeorgeBank g =new GeorgeBank();
		
		g.account_no="";
		g.cust_id="";
		g.cust_name="";
		g.Cust_address="";
		g.interestRate_PersonalLoan();
	}

}
