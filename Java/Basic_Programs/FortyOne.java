import java.util.Scanner;

public class FortyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        sc.close();

        int res = a%b;
        System.out.println("The remainder of the two numbers is: " + res);
    }
}
