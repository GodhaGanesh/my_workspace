package oops_programming_style4;

public class PentagonValidation {
	public static boolean checkColor(String color) {
		return color.equalsIgnoreCase("yellow")||color.equalsIgnoreCase("blue")||color.equalsIgnoreCase("orange");
	}
	public static boolean checkThickness(double outlineThickness) {
		return outlineThickness>=1 && outlineThickness<=10;
	}
}
