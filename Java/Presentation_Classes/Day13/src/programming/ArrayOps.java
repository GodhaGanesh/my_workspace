package programming;

public class ArrayOps {
	public static void main(String[] args) {
		int[] arr = { 1, 0,  -45, 6, 5, 4, 43 };
		boolean z = true, n = true;
		String err = "This Array Contains ";
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && z) {
				err = err + "Zero ";
				z = false;
				continue;
			}
			if (arr[i] < 0 && n) {
				err = err + "Negative value ";
				n = false;
			}
		}
		err = err + "in it.";
		if (z && n) {
			for (int i = 2; i < arr.length; i += 2)
				sum += arr[i];
			System.out.println(sum);
		}
		else
			System.out.println(err);
	}
}
