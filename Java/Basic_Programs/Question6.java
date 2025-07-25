import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array :- ");
        int size = sc.nextInt();
        int Names[]  = new int[size];

        for (int i = 0; i < Names.length; i++) {
            System.out.println("Enter the name "+(i+1)+":- ");
            Names[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < Names.length-1; i++)
            if (Names[i]==2)
                Names[i]=Names[i+1];
        
        for (int i = 0; i < Names.length; i++) {
            System.out.print(Names[i]+", ");
        }
        sc.close();
    }
}
