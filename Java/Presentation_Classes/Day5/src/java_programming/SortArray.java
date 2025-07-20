package java_programming;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = {34,56,43,45,32,1,24,5,6,65,4,4,2243345,654,766};
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("sorted array :- ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]+",");
		}
	}
}
