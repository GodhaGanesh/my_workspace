package exercise1;

import java.util.Scanner;

public class StudentCategorize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three subject marks : ");
		String marks[] = sc.nextLine().split(" ");
		int tMarks = 0;
		for( int i = 0; i < marks.length; i++) tMarks += Integer.parseInt(marks[i]);
		double per = tMarks/3;
		String category = "";
		if(per >= 70) category = "disinction";
		else if (per > 60) category = "first class";
		else if (per > 50) category = "Second class";
		else if (per > 40) category = "Compartmental";
		else category = "fail";
		System.out.println("You are "+category);
		sc.close();
	}
}
