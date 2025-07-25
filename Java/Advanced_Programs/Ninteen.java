class Ninteen{
	public static void main(String[] args){
		int n = 2;
		while(n<=100){
			boolean isPrime = true;
			for (int i = 2; i<n;i++) {
				if (n%i==0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(n);
			}
			System.out.print(", ");
			n++;
		}
	}
}