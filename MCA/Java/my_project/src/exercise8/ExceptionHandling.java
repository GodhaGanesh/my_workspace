package exercise8;

import java.util.Scanner;

public class ExceptionHandling {
    public static float div(int num1, int num2) throws ArithmeticException{
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the num1: ");
            String s1 = sc.nextLine();
            int num1 = Integer.parseInt(s1);
            System.out.print("Enter the num2: ");
            String s2 = sc.nextLine();
            int num2 = Integer.parseInt(s2);
            System.out.println(div(num1, num2));
        } catch (NumberFormatException e) {
            System.out.println("Given input is not an Integer type!!");
        } catch (ArithmeticException e) {
            System.out.println("Undefined because of zero division");
        }
    }
}
