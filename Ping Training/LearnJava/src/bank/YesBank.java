package bank;

public class YesBank  implements Bank{

	@Override
	public void interestRate_HomeLoan() {
		System.out.println("Interest rate is 12% pa");
	}

	@Override
	public void interestRate_CarLoan() {
		System.out.println("Interest rate is 9% pa");
	}

	@Override
	public void interestRate_PersonalLoan() {
		System.out.println("Interest rate is 10% pa");
		
	}

	@Override
	public void interestRate_EducationLoan() {
		System.out.println("Interest rate is 7% pa");
		
	}

}
