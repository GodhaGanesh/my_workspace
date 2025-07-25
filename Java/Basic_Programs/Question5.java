import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array :- ");
        int size = sc.nextInt();
        String Names[]  = new String[size];

        for (int i = 0; i < Names.length; i++) {
            System.out.println("Enter the name "+(i+1)+":- ");
            Names[i] = sc.next();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < Names.length; i++) {
            System.out.print(Names[i]+", ");
        }
        sc.close();
    }
}
