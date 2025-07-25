import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Size of Array :-");
        int size = scan.nextInt();
        int[] Numbers = new int[size];

        for (int i = 0; i < Numbers.length; i++) {
            System.out.println(Numbers[i]);
        }

        for (int i = 0; i < Numbers.length; i++) {
            System.out.print("Enter the Element "+(i+1)+" :- ");
            Numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < Numbers.length; i++) {
            System.out.println(Numbers[i]);
        }
        scan.close();
    }
}
