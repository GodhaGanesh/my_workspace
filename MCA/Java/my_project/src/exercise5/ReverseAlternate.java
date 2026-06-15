package exercise5;
import java.util.*;
class ReverseAlternate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Strings with space Separated: ");
		String[] words = sc.nextLine().split(" ");
		boolean alter = true;
		String res = "";
		for(String word : words){
			if(alter)
				res += new StringBuilder(word).reverse() + " ";
			else
				res += word + " ";
			alter = !alter;
		}
		System.out.println(res);
	}
}