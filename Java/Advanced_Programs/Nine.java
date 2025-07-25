class Nine{
	public static void main(String[] args){
		int num = 5;
		int stars = 1;
		int space = num/2;

		for (int i = 1; i<=num; i++) {
			for (int j = 1; j<=space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k<=stars; k++) {
				if (k==1||k==stars) {
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
			if (i<=num/2) {
				stars+=2;
				space--;
			}
			else{
				stars-=2;
				space++;
			}
		}
	}
}