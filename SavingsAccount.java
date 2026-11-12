import java.util.*;


public class SavingsAccount extends CheckingAccount{
	private double interestRate = 0.05;

	public static void main(String[] args){
		SavingsAccount sa = new SavingsAccount();
		sa.start();
	}	
	public SavingsAccount(){
		super(); // calls checkingaccount
	}
	public void calcInterest() {
		double interest = getBalance() * interestRate;
		setBalance(getBalance() + interest);
	}

	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}
	public double getInterestRate() {
		return this.interestRate;
	}

} // end SavingsAccount
