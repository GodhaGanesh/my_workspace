package oops_programming_style7;

public class AuthorValidation {

	public static boolean verifyName(String name) {
		String[] authors = Author.authors;
		for (int i = 0; i < authors.length; i++)
			if(authors[i].equalsIgnoreCase(name))
				return true;
		return false;
	}
	
	public static boolean verifyAge(int age) {
		return age>=15&&age<=60;		
	}
	
	public static boolean verifyBooksCount(int booksCount) {
		return booksCount>=5;
	}
	
}
