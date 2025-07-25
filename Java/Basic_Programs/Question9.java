public class Question9 {
    public static void main(String[] args) {
        int a[] = {1,8,25,35,4};

        for (int i = 1; i < a.length; i++) {
            if (a[i-1]>a[i]) {
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
