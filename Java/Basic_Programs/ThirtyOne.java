import java.util.Scanner;
public class ThirtyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Limit: ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Limit: ");
        int end = sc.nextInt();
        sc.close();

        if (start<end) {
            int sum = 0;
            for(int i = start;i<=end;i++){
                sum = sum + i;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("!! Invalid Values Check the Inputs!!");
        }
    }
}
