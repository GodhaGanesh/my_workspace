package programming;

import java.util.Scanner;

public class PrimeDigit {
	public static void main(String[] args) {
		System.out.println("give me a number :- ");
		int num = (new Scanner(System.in)).nextInt(),count = 0;
		
		while (num>0) {
			int l = num%10;
			if (l==2||l==5||l==7)
				count++;
			num=num/10;
		}
		System.out.println(count);
	}
}
