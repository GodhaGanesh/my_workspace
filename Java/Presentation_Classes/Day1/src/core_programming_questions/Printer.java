package core_programming_questions;

public class Printer {
	public Printer() {
		System.out.println("not passed anything");
	}
	public Printer(double num) {
		System.out.println("passed Double and value is "+num);
	}
	public Printer(int num) {
		System.out.println("passed Integer and value is "+num);
	}
	public Printer(String str) {
		System.out.println("passed String and value is "+str);
	}
	public Printer(char ch) {
		System.out.println("passed Character and value is "+ch);
	}
	public Printer(int[] arr) {
		System.out.println("passed an integer array and address is "+arr);
	}
	
	public static void main(String[] args) {
		Printer p1 = new Printer(18);
		int[] numbers = {12,23,12,132,1325,6787,665};
		Printer p2 = new Printer(numbers);
		Printer p3 = new Printer('Y');
		Printer p4 = new Printer("hii hello");
		Printer p5 = new Printer(43.76);
		Printer p6 = new Printer();
	}
}
