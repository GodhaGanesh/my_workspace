public class PalindromeString {
    public static void main(String[] args) {
        String str = "Madam",res = "",str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++)
            res = str1.charAt(i) + res;
        if (str1.equals(res))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }
}