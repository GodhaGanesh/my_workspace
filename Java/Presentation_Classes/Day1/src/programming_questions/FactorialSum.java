package programming_questions;
import java.util.Scanner;

public class FactorialSum {
	public static int findFactorial(int num) {
		int fact = 1;
		for(int i = num; i > 0; i--)
			fact = fact * i;
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		int factSum = 0;
		
		while(num>0) {
			int lastDigit = num % 10;
			factSum = factSum + findFactorial(lastDigit);
			num = num/10;
		}
		
		System.out.println("The sum of factorial of eact digit of given number is "+factSum);
	}
}
