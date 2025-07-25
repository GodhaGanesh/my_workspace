import java.util.Scanner;
class Fifteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give your UserName:- ");
		String username = sc.next();
		System.out.print("How many num times should print :- ");
		int num = sc.nextInt();
		for(int i = 0;i<num;i++){
			System.out.println((i+1)+" "+username);
		}
	}
}