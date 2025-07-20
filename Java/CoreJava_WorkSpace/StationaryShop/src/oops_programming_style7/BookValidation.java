package oops_programming_style7;

public class BookValidation {
	public static boolean verifyTitle(String title) {
		return isMoreTwoWords(title) && isPascal(title);
	}
	
	private static boolean isMoreTwoWords(String title) {
		String[] words = title.split(" ");
		return words.length>=2;
	}
	
	private static boolean isPascal(String title) {
		String[] words = title.split(" ");
		for (int i = 0; i < words.length; i++) {
			char ch = words[i].charAt(0);
			if (ch>='a' && ch<='z')
				return false;
		}
		return true;
	}
	
	public static boolean verifyPages(int pagesCount) {
		return pagesCount>=120 && pagesCount<=370;
	}
	
	public static boolean verifyPrice(double price) {
		return price>=250 && price<=700;
	}
}
