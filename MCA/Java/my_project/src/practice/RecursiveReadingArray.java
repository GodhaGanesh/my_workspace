package practice;

import java.util.Scanner;

public class RecursiveReadingArray {
	
	public static int[] nextArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int[] a = new int[sc.nextInt()];
		readElement(a, 0, sc);
		return a;
	}
	public static void readElement(int[] a, int i, Scanner sc) {
		if(a.length <= i) return;
		a[i] = sc.nextInt();
		readElement(a,i + 1, sc);
	}
	
	public static void main(String[] args) {
		int[] arr = nextArray();
		
		for(int ele:arr) System.out.print(ele+", ");
	}
}
