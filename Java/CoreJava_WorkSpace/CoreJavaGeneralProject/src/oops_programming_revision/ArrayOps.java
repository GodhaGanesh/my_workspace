package oops_programming_revision;

public class ArrayOps {
	private static int[] arr = new int[100];
	private static int presentIndex = 0;
	
	public void insertInArray(int x) {
		if(presentIndex < arr.length) {
			if(ArrayOps2.isUnique(arr, x, presentIndex)) {
				arr[presentIndex] = x;
				presentIndex++;
			}
			else
				System.err.println("Can't Assign "+'"'+x+'"'+" , Already Exists !!!");
		}
		else
			System.err.println("Array Filled !!!");
	}

	public static void printArray() {
		System.out.print("{");
		for (int i = 0; i < presentIndex; i++) {
			System.out.print(arr[i]);
			if(i == presentIndex-1) {
				break;
			}
			System.out.print(", ");
		}
		System.out.println("}");
	}
}
