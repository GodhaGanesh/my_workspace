package java_programming;

public class LargestEven {
	public static void main(String[] args) {
		int[] arr = {2,45,23,46,43,23,45,67,43,6};
		int max = 0;
		for(int i = 0; i < arr.length; i++)
			if(arr[i]%2==0&&arr[i]>max)
				max = arr[i];
		System.out.println("Highest largest even number is "+max);
	}
}
