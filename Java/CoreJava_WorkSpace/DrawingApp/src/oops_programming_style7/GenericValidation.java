package oops_programming_style7;

public class GenericValidation {
	public static String[] colors = {"red","orange","green","blue","purple"};
	public static boolean checkColor(String color) {
		for (int i = 0; i < colors.length; i++)
			if(colors[i].equalsIgnoreCase(color.trim()))
				return true;
			return false;
	}
	public static boolean checkThickness(double outlineThickness) {
		return outlineThickness>=1 && outlineThickness<=10;
	}
}
