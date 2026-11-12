import java.util.*;

public class CheckingAccount implements HasMenu {
	private double balance;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	} // end main
	
	public CheckingAccount(){
		this.balance = 0d;
	}

	public CheckingAccount(double balance){
		this.balance = balance;
	}

	public String menu(){
		System.out.println();
		System.out.println("0) Quit ");
		System.out.println("1) Check Balance ");
		System.out.println("2) Make a deposit ");
		System.out.println("3) Make a withdrawal ");
		String response = input.nextLine();
		return response;
	} // end menu
	
	public void start(){
		boolean keepGoing = true;
		String response;
		while (keepGoing){
			response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				System.out.println("Checking balance...");
				checkBalance();
			} else if (response.equals("2")){
				System.out.println("Making deposit...");
				makeDeposit();
			} else if (response.equals("3")){
				System.out.println("Making withdrawal...");
				makeWithdrawal();
			} else{
				System.out.println("Please print a number 0-3: ");
			}
		}
	} // end start
	
	public String getBalanceString(){
        	return String.format("$%.2f", this.balance);
    	}

	public void checkBalance(){
		System.out.println("Balance: " + this.getBalanceString());
	}

	private double getDouble(){
  		double d = input.nextDouble();
		input.nextLine();
		return d;
    	}
	
	public void makeDeposit(){
		System.out.println("How much to deposit? ");
		double deposit = getDouble();
		this.balance += deposit;
		System.out.println("New balance: " + getBalanceString());
	}

	public void makeWithdrawal(){
		System.out.println("How much ot withdraw? ");
		double withdrawal = getDouble();
		this.balance -= withdrawal;
		System.out.println("New balance: " + getBalanceString());
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double b){
		this.balance = b;
	}
}
