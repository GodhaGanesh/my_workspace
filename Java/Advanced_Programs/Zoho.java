class Zoho{
	public static void main(String[] args){
		int number = 1;
		int n = 6;
		int a = 1;
		int b = 2;

		for (int i=1;i<=n ;i++) {
			if(i%2==1){
				for (int j = 1;j<=number;j++) {
					System.out.print((a)+" ");
					a+=2;
				}
			}
			else{
				for (int j = 1;j<=number;j++) {
					System.out.print((b)+" ");
					b+=2;
				}
			}
			number++;
			System.out.println();
		}
	}
}