import java.util.Scanner;

public class ThirtyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Limit: ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Limit: ");
        int end = sc.nextInt();
        sc.close();

        if (start<end) {
            int product = 1;
            for(int i = start;i<=end;i++){
                product = product * i;
            }
            System.out.println(product);
        }
        else{
            System.out.println("!! Invalid Values Check the Inputs!!");
        }
    }
}
