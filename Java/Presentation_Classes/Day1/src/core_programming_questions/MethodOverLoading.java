package core_programming_questions;

public class MethodOverLoading {
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double a, double b) {
		return a+b;
	}
	public double add(double a, int b) {
		return a+b;
	}
	public double add(int a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(1.2,2.4));
		System.out.println(add(145,678));
		
		MethodOverLoading m1 = new MethodOverLoading();
		
		System.out.println(m1.add(1,2.3));
		System.out.println(m1.add(13.67,2));
		System.out.println(m1.add(123,234.78));
		System.out.println(add(24.34,34.569));
	}
}
