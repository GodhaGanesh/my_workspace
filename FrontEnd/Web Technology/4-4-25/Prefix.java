import java.util.Scanner;

public class Prefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.print("The longest common prefix is: ");

        for (int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);
            int count = 0;
            for (int j = 1; j < n; j++) {
                if (arr[0].charAt(i)== arr[j].charAt(i)) {
                    count++;
                }
            }
            if (count == arr.length-1) {
                System.out.print(ch);
            } else {
                break;
            }
        }
    }
}