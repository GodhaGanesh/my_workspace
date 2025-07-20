package oops_programming_style3;

public class TrainValidation {
	public static boolean verifyDestination(String destination) {
		for (int i = 0; i < destination.length(); i++) {
			char ch = destination.charAt(i);
			if (!(ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch==' ')) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean verifyDistance(double distance) {
		return distance>=500 && distance<=800;
	}
	
	public static boolean verifySpeed(double speed) {
		return speed>=60 && speed<=100;
	}
}
