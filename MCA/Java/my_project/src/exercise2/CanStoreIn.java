package exercise2;

import java.util.Scanner;

public class CanStoreIn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Integer type value: ");
		long x = sc.nextLong();
		System.out.println(x+" can be stored in :");
		if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
			System.out.println("*Byte");
		if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
			System.out.println("*Short");
		if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
			System.out.println("*Integer");
		if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
			System.out.println("*Long");
		sc.close();
	}
}
