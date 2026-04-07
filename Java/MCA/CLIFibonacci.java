public class CLIFibonacci {
	public static void febo(int n) {
		febGen(0,1,n);
	}
	public static void febGen(int i, int j, int n) {
		if(n <= 0) return;
		if(n == 1) {
			System.out.println(i+".");
			return;
		}
		System.out.print(i+", ");
		febGen(j, i + j, n - 1);
	}
	public static void main(String[] args) {
		if(args.length == 1) febo(Integer.parseInt(args[0]));
		else System.out.println("Enter one valid argument in command line");
	}
}