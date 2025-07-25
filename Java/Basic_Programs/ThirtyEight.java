import java.util.Scanner;

public class ThirtyEight {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Give the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Give the Second Number : ");
        int num2 = sc.nextInt();
        sc.close();
        int sub = num1-num2;
        System.out.println("The substraction of "+num1+" & "+num2+" is "+sub);
    }
}
