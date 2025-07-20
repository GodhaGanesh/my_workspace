package oops_programming_revision;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[arr2.length-(i+1)] = arr1[i];
		}
		
		System.out.println("----> Array 1 Elements <----");
		printArray(arr1);
		System.out.println("----> Array 2 Elements <----");
		printArray(arr2);
	}
	
	public static void printArray(int[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i == arr.length-1) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println("}");
	}
}
