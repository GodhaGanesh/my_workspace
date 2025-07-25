import java.util.*;
public class ThirtySeven {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Give the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Give the Second Number : ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1+num2;
        System.out.println("The sum of "+num1+" & "+num2+" is "+sum);
    }
}
