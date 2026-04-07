package exercise1;

public class ConcatenateStringsCLI {
	public static void main(String[] args) {
		if(args.length == 0) System.out.println("No Agruments passed");
		for(int i = 1; i < args.length; i++) System.out.print(args[i]+", ");
	}
}
