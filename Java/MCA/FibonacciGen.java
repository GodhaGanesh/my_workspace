import java.util.Scanner;
public class FibonacciGen {
	public static void fibo(int n) {
		fibGen(0,1,n);
	}
	public static void fibGen(int i, int j, int n) {
		if(n <= 0) return;
		if(n == 1) {
			System.out.println(i+".");
			return;
		}
		System.out.print(i+", ");
		fibGen(j, i + j, n - 1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to gen fibonacci series : ");
		fibo(sc.nextInt());
		sc.close();
	}
}