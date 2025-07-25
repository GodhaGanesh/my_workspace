import java.util.Scanner;
public class concentric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of concentric squares: ");
        int n = sc.nextInt();
        sc.close();
        int[][] arr = new int[2 * n - 1][2 * n - 1];
        System.out.println(arr.length);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < arr.length - i; j++) {
                for (int k = i; k < arr.length - i; k++) {
                    arr[j][k] = n - i;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
