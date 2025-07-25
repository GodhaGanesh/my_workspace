import java.util.Scanner;

public class ThirtySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Give me First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Give me Second Number : ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1%num2==0) {
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}
