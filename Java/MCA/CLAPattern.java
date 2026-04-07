public class CLAPattern{
	public static void printPattern(int n){
		for(int i = 1; i <=  n; i++) {
			for(int j = 1; j <= i; j++) System.out.print(" * ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		if(args.length == 1) printPattern(Integer.parseInt(args[0]));
		else System.out.println("Enter One Valid Argument in command Line");
	}
}