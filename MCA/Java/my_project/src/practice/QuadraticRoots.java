package practice;

import java.util.Scanner;

public class QuadraticRoots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The a value : ");
        int a = sc.nextInt();

        System.out.print("Enter The b value : ");
        int b = sc.nextInt();

        System.out.print("Enter The c value : ");
        int c = sc.nextInt();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            System.out.println("Roots are imaginary");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

            System.out.println("Root 1 : " + root1);
            System.out.println("Root 2 : " + root2);
        }

        sc.close();
    }
}