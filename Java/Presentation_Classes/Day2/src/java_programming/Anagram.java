package java_programming;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(!(str1.length()==str2.length()))
			return false;
		char[] word1 = str1.toCharArray();
		char[] word2 = str2.toCharArray();
		for(int i = 0; i<word1.length;i++) {
			boolean found =false;
			for(int j = 0; j<word2.length;j++) {
				if(word1[i]==word2[j]) {
					found = true;
					word2[j] = '#';
				}
			}
			if(!found)
				return found;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str1 = "god";
		String str2 = "Dog";
		System.out.println(isAnagram(str1, str2));
	}
}
