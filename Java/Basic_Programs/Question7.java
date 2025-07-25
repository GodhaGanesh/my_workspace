import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array :- ");
        int size = sc.nextInt();
        int Names[] = new int[size];

        for (int i = 0; i < Names.length; i++) {
            System.out.print("Enter the name " + (i + 1) + ":- ");
            Names[i] = sc.nextInt();
            System.out.println();
        }
        sc.close();
        System.out.println();
        System.out.println();

        for (int i = 0; i < Names.length; i++) {
            System.out.print(Names[i] + ", ");
        }
        System.out.println();

        int max = Names[0], min = Names[0], a = 0, b = 0;

        for (int i = 0; i < Names.length; i++) {
            if (Names[i] > max) {
                max = Names[i];
                a = i;
            }
            if (Names[i] < min) {
                min = Names[i];
                b = i;
            }
        }

        Names[a] = min;
        Names[b] = max;

        System.out.println("Max Element is :-" + max);
        System.out.println("Min Element is :-" + min);
        System.out.println("After Swapping :-");

        for (int i = 0; i < Names.length; i++) {
            System.out.print(Names[i] + ", ");
        }
    }
}
