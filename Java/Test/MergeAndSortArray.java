public class MergeAndSortArray {
	public static void main(String[] args) {
		int[] arr1 = {25,45,56,17,18};
		int[] arr2 = {26,19,11,67};
		int size = arr1.length+arr2.length;
		int[] arr3 = new int[size];
		int j = 0;
		int k = 0;
		for (int i = 0; i<size; i++) {
			if(j<arr1.length) {
				arr3[i] = arr1[j];
				j++;
				continue;
			}
			if(k<arr2.length){
				arr3[i] = arr2[k];
				k++;
			}
		}

		for(int i = 0; i<size-1; i++) {
			for(int l = i+1; l<size; l++) {
				if(arr3[i]>arr3[l]) {
					int temp = arr3[i];
					arr3[i] = arr3[l];
					arr3[l] = temp;
				}
			}
		}
		System.out.println("Two Arrays Merged and sorted results are :- ");

		for (int i = 0; i<size; i++) {
			System.out.println(arr3[i]);
		}
	}
}