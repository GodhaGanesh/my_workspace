package programming_questions;
import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digitCount = 0;
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		
		while(num>0) {
			num = num/10;
			digitCount++;
		}
		
		System.out.println("There are "+digitCount+" Digits in Given Number.");
	}
}
