import java.util.Scanner;
public class ThirtyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number :-");
        int num =sc.nextInt();
        sc.close();

        if (num>0)
            System.out.println("Positive Number");
        else if (num==0)
            System.out.println("It Is zero ");
        else
            System.out.println("Negative Number");
    }
}
