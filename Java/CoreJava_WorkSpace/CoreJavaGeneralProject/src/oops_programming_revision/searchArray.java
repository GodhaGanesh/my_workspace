package oops_programming_revision;

import java.util.Scanner;
public class searchArray {
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		arr[0] = 35;
		arr[1] = 45;
		arr[2] = 55;
		arr[3] = 65;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Element to Search : ");
		int sele = scan.nextInt();
		scan.close();
		
		if(searchElement(arr, sele))
			System.out.println("element Found !!");
		else
			System.err.println("elment not Found !!");
	}
	
	public static boolean searchElement(int[] a, int ele) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				printArray(a,ele);
				return true;
			}
		}
		return false;
	}
	
	public static void printArray(int[] arr, int ele) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i])
				System.err.print(arr[i]);
			else
				System.out.print(arr[i]);
			if(i == arr.length-1) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println("}");
	}
}
