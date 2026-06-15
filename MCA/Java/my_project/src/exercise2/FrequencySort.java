package exercise2;

import java.util.Scanner;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter "+i+" element: ");
            arr[i] = sc.nextInt();
            freq[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (freq[i] == -1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[i] < freq[j]) {
                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println(arr[i] + " -> " + freq[i]);
            }
        }
    }
}
