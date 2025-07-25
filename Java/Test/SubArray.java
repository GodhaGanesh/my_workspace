class SubArray 
{
	public static int evenCount(int[] arr) {
		int evenCount = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}

	public static int[] assignSubArray(int[] arr, int evenCount, String mode) {
		int[] assignEven = new int [evenCount];
		int[] assignOdd = new int [arr.length - evenCount];
		int j = 0;
		int k = 0;

		for (int i = 0; i<arr.length; i++) {
			if (arr[i]%2 == 0)
				assignEven[j++] = arr[i];
			else
				assignOdd[k++] = arr[i];
		}
		if(mode.equals("even"))
			return assignEven;
		return assignOdd;
	}

	public static void main(String[] args) {
		int[] userArr = {10,20,15,17,9,14,12,17,40};
		int[] evenArr = assignSubArray(userArr,evenCount(userArr),"even");
		int[] oddArr = assignSubArray(userArr,evenCount(userArr),"odd");

		for (int i = 0; i<evenArr.length-1; i++) {
			for (int j = i+1; j<evenArr.length; j++){
				if (evenArr[i]<evenArr[j]){
					int temp = evenArr[i];
					evenArr[i] = evenArr[j];
					evenArr[j] = temp;
				}
			}
		}

		for(int i = 0; i<oddArr.length-1; i++) {
			for(int j = i+1; j<oddArr.length; j++) {
				if (oddArr[i]>oddArr[j]){
					int temp = oddArr[i];
					oddArr[i] = oddArr[j];
					oddArr[j] = temp;
				}
			}
		}

		int[][] resultArray = {evenArr,oddArr};

		for (int i = 0; i<resultArray.length; i++)
		{
			for(int j = 0;j<resultArray[i].length;j++)
			{
				System.out.print(resultArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
