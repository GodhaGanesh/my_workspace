class Prime		//didn't import scanner class but scanner used;
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number");
		int n = sc.nextInt();
		int i = 1;		//i must be declared as 2 why because the first prime number is 2
		int count = 0;
		while(true){
			boolean isPrime = true;
			for(int j = 2;j<i;j++){
				if(i%j==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				count++;
			}
			if(count==n){
				System.out.println(n+"th Prime Number is "+i);
				break;
			}
			//Here, there is no increment of i so the answer is always i ony
		}
	}
}
