package core_programming_questions;

public class BankAccount {
	private String holderName;
	private long accNumber;
	private double balance;
	
	public BankAccount(String holderName, double balance) {
		if(BankAccountValidation.verifyAmount(balance)) {
			this.holderName = holderName;
			this.accNumber = BankAccountValidation.assignAccNumber();
			this.balance = balance;
			System.out.println("Account created !!");
			customerDetails();
		}
		else {
			System.err.println("cant create account it is invalid");
		}
	}
	
	public void customerDetails() {
		System.out.println("account holder :- "+holderName);
		System.out.println("Account Number :- "+accNumber);
	}
	
	public void showBalance() {
		customerDetails();
		System.out.println("Your Balance Amount is "+balance+"/- only");
	}
	
	public void deposit(double amount) {
		customerDetails();
		if (amount>0&&amount<100000) {
			balance = balance + amount;
			System.out.println("Deposited successfully");
			System.out.print("Now ");
			showBalance();
		} else {
			System.err.println("can't deposit !!");
			System.out.println("amount should be in the range of (1-99999)");
		}
	}
	
	public void withdraw(double amount) {
		customerDetails();
		if (amount>1&&amount<=balance) {
			balance = balance - amount;
			System.out.println("withdraw Completed");
			System.out.print("Now ");
			showBalance();
		} else {
			System.err.println("can't withdraw !!");
			System.out.println("amount should be in the range of (1-"+balance+")");
		}
	}
}
