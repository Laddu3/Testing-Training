package bank;

public class AxisBank implements Bank {

	@Override
	public void interestRate_HomeLoan() {
		System.out.println("Interest Rate is 8.5% pa");
		
	}

	@Override
	public void interestRate_CarLoan() {
		System.out.println("Interest Rate is 12% pa");
		
	}

	@Override
	public void interestRate_PersonalLoan() {
		System.out.println("Interest Rate is 7% pa");
		
	}

	@Override
	public void interestRate_EducationLoan() {
		System.out.println("Interest Rate is 10% pa");
		
	}

}
