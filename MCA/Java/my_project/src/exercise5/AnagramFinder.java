package exercise5;
import java.util.*;
class AnagramFinder{
	public static boolean isAnagram(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		for(int i = 0; i < s1.length(); i++){
			char ch = s1.charAt(i);
			int c1 = 0, c2 = 0;
			for(int j = 0; j < s1.length(); j++){
				if(s1.charAt(j) == ch) c1++;
				if(s2.charAt(j) == ch) c2++;
			}
			if(c1 != c2) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String sr1 = sc.nextLine().trim().toLowerCase();
		System.out.print("Enter the String 2: ");
		String sr2 = sc.nextLine().trim().toLowerCase();
		if(isAnagram(sr1, sr2)) System.out.println(sr1+" "+sr2+" both are Angrams");
		else System.out.println(sr1+" "+sr2+" both not are Angrams");
		sc.close();
	}
}