import java.util.Scanner;
class Eighteen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		System.out.println("Count of Factors of a given number is :- "+count);
	}
}