package exercise2;

import java.util.Scanner;

public class OddAndPrime {
	private static boolean isOddAndPrime(int n) {
		int i = 2;
		for(i = 2; i < n && (n % i != 0); i++);
		return i == n && n != 2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter thr size of array : ");
		int arr[] = new int[sc.nextInt()], count = 0;
		System.out.println("Enter the array Elements: ");
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		for(int i = 0; i < arr.length; i++) 
			if(isOddAndPrime(arr[i])) {
				count++;
				System.out.print(arr[i]+", ");
			}
		if(count == 0) System.out.println("Not Found!");
		sc.close();
	}
}
