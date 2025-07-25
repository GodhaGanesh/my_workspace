public class Question2 {
    public static void main(String[] args) {
        int[] numbers ={45,78,46,37,28,89,78,};
        int product = 1;

        for(int i = 0;i<numbers.length;i++){
            product = product*numbers[i];
        }
        System.out.println(product);
    }
}
