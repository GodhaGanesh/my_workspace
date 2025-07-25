public class Question {
    public static void main(String[] args) {
        int[] numbers = {8,9,6,45,89,0,89,67,55,88};

        for(int i =0;i<numbers.length;i++)
            if (i%2!=0 && numbers[i]%2==0) {
                System.out.println(" "+numbers[i]+", ");
            }
    }
}
