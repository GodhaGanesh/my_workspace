package oops_programming_revision;

public class ArrayOps2 {
	public static boolean isUnique(int[] arr, int x, int index) {
		for (int i = 0; i < index; i++) {
			if (arr[i] == x) {
				return false;
			}
		}
		return true;
	}
}
