class OddElements {
    public static void main(String[] args) {
        int[] Numbers = { 10, 15, 20, 11, 12, 6, 7, 89, 6, 32, 3, 2, 1, 5, 67 };

        //WAPTP Odd Numbers in the Array

        System.out.print("Odd Numbers in the Array are : ");

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] % 2 != 0)
                System.out.print(Numbers[i] + ", ");
        }

        System.out.println();
        System.out.print("Odd Elements in the Array are : ");

        for (int i = 0; i < Numbers.length; i++) {
            if (i % 2 == 0)
                System.out.print(Numbers[i] + ", ");
        }

        System.out.println();
        System.out.print("Elements divisible by 5 in the Array are : ");

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] % 5 == 0)
                System.out.print(Numbers[i] + ", ");
        }

        System.out.println();
        System.out.print("Elements Greater than 10 in the Array are : ");

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] > 10)
                System.out.print(Numbers[i] + ", ");
        }

        System.out.println();
        System.out.print("Elements Between 15 & 25 in the Array are : ");

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] > 15 && Numbers[i] < 25)
                System.out.print(Numbers[i] + ", ");
        }

        System.out.println();
        System.out.print("Elements Ends With 2 in the Array are : ");

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i]%10==2)
                System.out.print(Numbers[i] + ", ");
        }

        System.out.println();
        System.out.print("Elements Starts With 3 in the Array are : ");
        int fd = 0;
        for (int i = 0; i < Numbers.length; i++) {
            int ele = Numbers[i];
            while (ele > 9) {
                ele = ele / 10;
                fd = ele % 10;
            }
            if (fd == 3) {
                System.out.print(Numbers[i]+", ");
            }
        }

        System.out.println();
        System.out.print("sum of digits of elements in the Array are : ");

        for (int i = 0; i < Numbers.length; i++)
            System.out.print(sumOfDigits(Numbers[i])+", ");
    }

    public static int sumOfDigits (int num) {
        int sum = 0;
        while (num>0) {
            int ld = num %10;
            sum = sum + ld;
            num = num/10;
        }
        return sum;
    }
}
