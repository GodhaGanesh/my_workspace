import java.util.Scanner;
class Seventeen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a Number :- ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i=1; i<=num; i+=2) {
			if (num%i==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of even factors of a given number is "+sum);
	}
}