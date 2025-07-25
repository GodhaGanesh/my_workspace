import java.util.Scanner;
public class TwentyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Limit: ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Limit: ");
        int end = sc.nextInt();
        sc.close();

        if (start<end) {
            for(int i = start;i<=end;i++){
                if (i%2==0) {
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("!! Invalid Values Check the Inputs!!");
        }
    }
}
