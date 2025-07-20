package java_programming;
import java.util.*;
public class TwistedPrime {
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i = 2; i<num/2; i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static int revNum(int num) {
		int rev = 0;
		while(num>0) {
			int ld = num % 10;
			rev = (rev*10)+ld;
			num = num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		if(num>10) {
			if(isPrime(num)&&isPrime(revNum(num)))
				System.out.println(num+" is a Twisted Prime.");
			else
				System.out.println(num+" is not a Twisted Prime.");
		}
		else
			System.out.println(num+" is not a Twisted Prime.");
		sc.close();
	}
}
