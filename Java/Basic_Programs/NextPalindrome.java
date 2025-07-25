import java.util.Scanner;

class NextPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        num++; // Start checking from the next number

        while (true) {
            int original = num, reversed = 0, temp = num;

            // Reverse the number
            while (temp > 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            // Check if palindrome
            if (original == reversed) {
                System.out.println("The next palindrome after the given number is: " + num);
                break;
            }
            num++; // Move to the next number
        }
    }
}
