class Eleven{
	public static void main(String[] args){
		System.out.print("Enter A number : - ");
		int num = 5;

		for (int i = 1;i<=num ; i+=2) {
			if (i%5==0) {
				System.out.print("Divisible By Five");
			}
			else{
				System.out.print(i);
			}
			if (i==num) {
				break;
			}
			System.out.print(" , ");
		}
	}
}