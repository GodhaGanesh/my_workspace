import java.util.*;
class NextPalin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a Number : ");
		int n = sc.nextInt();
		while(true){
			n++;
			int temp = n;
			int rev = 0;
			while(temp>0){
				int ld = temp%10;
				rev = (rev*10)+ld;
				temp = temp/10;
			}
			if(temp == n)	//n should be compare with the rev not temp
			{
				System.out.println("next Palindrome found "+n);
				break;
			}
		}
	}
}
