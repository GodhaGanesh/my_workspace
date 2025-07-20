package oops_programming_revision;
import java.util.*;
public class RevNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int userNum = input.nextInt();
		
		while(true) {
			int revNum = reverseNumber(userNum);
			int sum = revNum + userNum;
			System.out.println("----------------");
			System.out.println(userNum);
			System.out.println(revNum);
			System.out.println("----------------");
			if(isPalindrome(sum)) {
				System.out.println("the result is :- "+sum);
				break;
			}
			userNum = sum;
		}
	}
	public static int reverseNumber(int num) {
		int rev = 0;
		while(num > 0) {
			int lastDigit = num%10;
			rev = (rev*10)+lastDigit;
			num = num/10;
		}
		return rev;
	}
	public static boolean isPalindrome(int num) {
		return reverseNumber(num) == num;
	}
}
