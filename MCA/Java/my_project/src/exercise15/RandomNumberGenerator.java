package exercise15;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Give me origin(should be > 0): ");
        int s = sc.nextInt();
        System.out.println("Give me bound: ");
        int e = sc.nextInt();
        int num = random.nextInt(s,e);
        System.out.println(String.valueOf(num));
    }
}
