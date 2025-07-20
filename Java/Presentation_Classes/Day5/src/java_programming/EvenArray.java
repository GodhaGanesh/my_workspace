package java_programming;

public class EvenArray {
	public static void main(String[] args) {
		int[] arr1 = {12,3,445,6,6,768,5,43};
		int[] arr2 = {35,67,798,65,67,65,11};
		int[] resArr = new int[arr1.length+arr2.length];
		int size = 0;
		
		for(int i = 0; i< arr1.length; i++)
			if(arr1[i]%2==0)
				resArr[size++] = arr1[i];
		for(int i = 0; i< arr2.length; i++)
			if(arr2[i]%2==0)
				resArr[size++] = arr2[i];
		int[] finalArr = new int[size];
		
		for(int i = 0; i<size;i++)
			finalArr[i] = resArr[i];
		System.out.print("The Merged array :- ");
		for(int i = 0; i<size; i++)
			System.out.print(" "+finalArr[i]+",");
	}
}
