package core_programming_questions;
//import java.math.*;

public class BankAccountValidation {
	public static boolean verifyAmount(double amount) {
		return amount>0&&amount<100000;
	}
	public static long assignAccNumber() {
		return (long)(Math.random() * (999_999_999 - 100_000_000 + 1)) + 100_000_000;
	}
}
