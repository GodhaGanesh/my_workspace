class PrimeInArray {
    public static void main(String[] args) {
        int[] numbers = { 3, 6, 9, 30, 67, 246, 829, 2, 1};

        System.out.print("Prime Numbers in the Array are :- ");

        for (int i = 0; i < numbers.length; i++)
            if (isPrime(numbers[i]))
                System.out.print(numbers[i] + ", ");
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
