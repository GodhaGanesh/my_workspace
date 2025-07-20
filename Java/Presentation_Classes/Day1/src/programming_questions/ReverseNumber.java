package programming_questions;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		int i = num;
		int revNum = 0;
		
		while(num>0) {
			int lastDigit = num % 10;
			revNum = (revNum*10)+lastDigit;
			num = num/10;
		}
		
		System.out.println("Given Number is "+i+". Reverse of this Number is "+revNum);
	}
}
