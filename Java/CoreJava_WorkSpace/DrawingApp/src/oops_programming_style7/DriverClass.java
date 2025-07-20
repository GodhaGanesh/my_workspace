package oops_programming_style7;

import java.util.*;
public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		
		do {
			System.out.println();
			System.out.println();
			System.out.println("Press 1 for Triangle....");
			System.out.println("Press 2 for Hexagon....");
			System.out.println("Press 3 for Pentagon....");
			System.out.print("Enter your Choice :- ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Give me color of shape :- ");
			String color = sc.nextLine();
			
			System.out.print("Do You want Ouline (yes/no):- ");
			Outline outline = getOutline(sc,sc.next());
			
			switch (choice) {
				case 1: {
					System.out.print("Give me height of Triangle :- ");
					int height = sc.nextInt();
					System.out.print("Give me base of Triangle :- ");
					int base = sc.nextInt();
					shape = (Shape) new Triangle(color, outline, height, base);
					break;
				}
				case 2: {
					System.out.print("Give me side length of Hexagon :- ");
					double side = sc.nextDouble();
					shape = (Shape) new Hexagon(color, outline, side);
					break;
				}
				case 3: {
					System.out.print("Give me side length of Pentagon :- ");
					double side = sc.nextDouble();
					shape = (Shape) new Pentagon(color, outline, side);
				}
			}
			sc.nextLine();
			shape.display();
			System.out.println();
			System.out.println();
			System.out.print("do you want to create another shape(yes/no) :- ");
		}while(sc.nextLine().toLowerCase().trim().equals("yes"));
		sc.close();
	}

	private static Outline getOutline(Scanner sc, String outlineNeed) {
		if(outlineNeed.trim().equalsIgnoreCase("yes")) {
			System.out.print("    Give the Outline Thickness :- ");
			double ot = sc.nextDouble();
			sc.nextLine();
			System.out.print("    Give the Outline Color :- ");
			String oc = sc.nextLine();
			System.out.print("    Give the Outline style :- ");
			String os = sc.nextLine();
			return new Outline(ot,oc,os);
		}
		return new Outline();
		
	}
}