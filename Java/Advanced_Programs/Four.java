class Four 
{
	public static void main(String[] args) 
	{
		int num = 3;
		int rowcol = num*2-1;
		int temp = num;
		int stars = rowcol;
		int space = 0;

		for(int i = 1;i<=rowcol;i++){
			for(int j = 1;j<=space;j++){
				System.out.print(temp--+" ");
			}
			for(int k = 1;k<=stars;k++){
				System.out.print(num+" ");
			}
			for(int j = 1;j<=space;j++){
				System.out.print(++temp+" ");
			}
			if(i<=rowcol/2){
				stars-=2;
				space++;
				num--;
			}
			else{
				stars+=2;
				space--;
				num++;
			}
			System.out.println();
		}
	}
}
