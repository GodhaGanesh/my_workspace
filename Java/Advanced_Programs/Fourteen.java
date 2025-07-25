import java.util.Scanner;
class Fourteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give your UserName:- ");
		String username = sc.next();
		for(int i = 0;i<25;i++){
			System.out.println(username);
		}
	}
}