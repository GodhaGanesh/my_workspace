class Thirteen 
{
	public static void main(String[] args) 
	{
		int num = 9;
		int stars = num;
		int space = 0;

		for(int i = 1;i<=num;i++){
			for(int j = 1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k = 1;k<=stars;k++){
				System.out.print("*");
			}
			if(i<=num/2){
				stars-=2;
				space++;
			}
			else{
				stars+=2;
				space--;
			}
			System.out.println();
		}
	}
}
