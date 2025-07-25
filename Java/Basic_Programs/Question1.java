//to print count of elements
public class Question1 {
    // public static void main(String[] args) {
    //     int[] numbers = { 6, 7, 8, 9, 345, 6, 7, 8, 9, 7, 6, 5, 43, 3 };
    //     int i = 0;
    //     for (i = 0; i < numbers.length; i++);
    //     System.out.println(i);
    // }

    // public static void main(String[] args) {
    //     int[] numbers = { 6, 7, 8, 9, 345, 6, 7, 8, 9, 7, 6, 5, 43, 3 };
    //     int count = 0 ;

    //     for(int i = 0;i<numbers.length;i++){
    //         if (numbers[i]%2==0) {
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }

    public static void main(String[] args) {
        int[] numbers = { 6, 7, 8, 9, 345, 6, 7, 8, 9, 7, 6, 5, 43, 3 };
        int sum=0;

        for(int i = 0;i<numbers.length;i++){
            sum = sum +numbers[i];
        }
        System.out.println(sum);
    }
}
