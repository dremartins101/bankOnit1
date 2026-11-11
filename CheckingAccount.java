import java.util.*;
import java.io.*;

public class CheckingAccount implements HasMenu, Serializable {
	double balance;

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
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("0) Quit ");
		System.out.println("1) Check Balance ");
		System.out.println("2) Make a deposit ");
		System.out.println("3) Make a withdrawal ");
		String response = input.nextLine();
		return response;
	} // end menu
	
	public String start(){
		boolean keepGoing = true;
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
				System.out.println("Making withdrawal...")
			} else{
				System.out.println("Please print a number 0-3: ");
			}
		}
	} // end start
	



