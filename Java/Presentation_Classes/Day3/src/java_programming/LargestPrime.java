package java_programming;

public class LargestPrime {
	public static boolean isPrime(int num) {
		for(int i = 2;i<num/2;i++)
			if(num%i==0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {23,56,7,9,76,5,4,43,45,6,7,5,4,56,6,7,8,8,9,0,98,90,7};
		int max = 0;
		
		for(int i = 0; i<arr.length;i++)
			if(isPrime(arr[i])&&arr[i]>max)
				max = arr[i];
		System.out.println("the largest Prime Given Array is "+max);
	}
}
