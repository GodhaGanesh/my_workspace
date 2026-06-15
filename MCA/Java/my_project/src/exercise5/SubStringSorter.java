package exercise5;
import java.util.Scanner;
import java.util.Arrays;
public class SubStringSorter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a String: ");
		String s = sc.nextLine();
		int n = 0;
		do{
			System.err.println("!!number should be less than the String length!!");
			System.out.print("Give me a Number: ");
			n = sc.nextInt();
		}while(n > s.length()||n <= 0);
		String[] strs = new String[s.length() - n + 1];
		for(int i = 0; i < strs.length; i++)
			strs[i] = s.substring(i, i + n);
		Arrays.sort(strs, String.CASE_INSENSITIVE_ORDER);
		for(String str : strs) System.out.println(str);
		sc.close();
	}
}
	