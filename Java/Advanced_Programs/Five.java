class Five{
	public static void main(String[] args){
		int num = 5;
		int temp = 1;
		for (int i = 1; i<=num*2; i++) {
			System.out.print(temp+" ");
			if (i==num) {
				System.out.println();
				temp++;
			}
			if (i<num) {
				temp++;
			}
			else{
				temp--;
			}
		}
	}
}