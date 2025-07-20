package oops_programming_style7;

public class OutlineValidation {
	
	public static String[] colors = {"red","orange","green","blue","purple"};
	public static String[] styles = {"solid","dashed","dotted"};
	
	public static boolean verifyThickness(double thickness) {
		return thickness>=0.25 && thickness<=6.0;
	}
	
	public static boolean verifyColor(String color) {
		for (int i = 0; i < colors.length; i++)
			if(colors[i].equalsIgnoreCase(color.trim()))
				return true;
		return false;
	}
	
	public static boolean verifyStyle(String style) {
		for (int i = 0; i < styles.length; i++)
			if (styles[i].equalsIgnoreCase(style.trim()))
				return true;
		return false;
	}
}
