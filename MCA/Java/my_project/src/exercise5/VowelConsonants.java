package exercise5;
import java.util.Scanner;
class VowelConsonants{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Strings with space Separated: ");
		String[] words = sc.nextLine().split(" ");
		for(String word:words){
			int vowelCount = 0;
			int consCount = 0;
			for(int i = 0; i < word.length(); i++){
				char ch = word.toLowerCase().charAt(i);
				if(ch >= 'a' && ch <= 'z')
					if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
						vowelCount++;
					else
						consCount++;
			}
				System.out.println(word);
				System.out.println("vowels -> "+vowelCount);
				System.out.println("consonants -> "+consCount);
				System.out.println("\n");
		}
	}
}
