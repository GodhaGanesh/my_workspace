package oops_programming_style6;

import java.util.*;
public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		String anotherShape;
		
		do {
			System.out.println("Press 1 for Triangle....");
			System.out.println("Press 2 for Hexagon....");
			System.out.println("Press 3 for Pentagon....");
			System.out.print("Enter your Choice :- ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1: {
					System.out.print("Give me color of Triangle :- ");
					String color = sc.nextLine();
					System.out.print("Give me Outline of Triangle :- ");
					double outline = sc.nextDouble();
					System.out.print("Give me height of Triangle :- ");
					int height = sc.nextInt();
					System.out.print("Give me base of Triangle :- ");
					int base = sc.nextInt();
					shape = (Shape) new Triangle(color, outline, height, base);
					break;
				}
				case 2: {
					System.out.print("Give me color of Hexagon :- ");
					String color = sc.nextLine();
					System.out.print("Give me Outline of Hexagon :- ");
					double outline = sc.nextDouble();
					System.out.print("Give me side length of Hexagon :- ");
					double side = sc.nextDouble();
					shape = (Shape) new Hexagon(color, outline, side);
					break;
				}
				case 3: {
					System.out.print("Give me color of Pentagon :- ");
					String color = sc.nextLine();
					System.out.print("Give me Outline of Pentagon :- ");
					double outline = sc.nextDouble();
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
			anotherShape = sc.nextLine().toLowerCase().trim();
			System.out.println();
			System.out.println();
		}while(anotherShape.equals("yes"));
		
		sc.close();
	}
}

//for triangle include base and height attribute
//validation rule base: 5 - 20
//height : 7 - 30
//define area of triangle