package practice;

import java.util.Scanner;

public class Arr {
	public static int[] nextArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int a[] = new int[sc.nextInt()];
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		return a;
	}
	
	public int[] nRead() {
		return nextArray();
	}
	
	public static void main(String[] args) {
		int[] arr1 = nextArray();
		Arr arr = new Arr();
		int[] arr2 = arr.nRead();
		
		for(int ele:arr1) System.out.print(ele+", ");
		System.out.println();
		for(int ele:arr2) System.out.print(ele+", ");
	}
}
