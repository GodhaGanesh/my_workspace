class Ten{
	public static void main(String[] args){
		int num = 5;
		int stars = 1;
		int space = num/2;

		for (int i = 1; i<=num; i++) {
			for (int j = 1; j<=space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k<=stars; k++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i<=num/2) {
				stars++;
				space--;
			}
			else{
				stars--;
				space++;
			}
		}
	}
}