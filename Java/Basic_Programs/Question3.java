public class Question3 {
    public static boolean isPalin(int num) {
        int rev = 0, temp = num;
        while (num > 0) {
            int ld = num % 10;
            rev = (rev * 10) + ld;
            num /= 10;
        }
        return rev == temp;
    }

    public static void main(String[] args) {
        int[] numbers = { 32, 45, 33, 8787, 43, 232, 356, 343, 292, 000 };

        for (int i = 0; i < numbers.length; i++)
            if (isPalin(numbers[i]))
                System.out.println(numbers[i]);
    }
}
