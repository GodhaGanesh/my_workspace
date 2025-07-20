package core_programming_questions;

public class DriverClass {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("V GODHA GANESH", 1000);
		b1.withdraw(200);
		b1.showBalance();
	}
}
