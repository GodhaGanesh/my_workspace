public class Question10 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    System.out.print(a[i]+" ");
                }
            }
        }
        int c = swap();
        System.out.println(c);
    }
    public static int swap(){
        int a = 2;
        int b = 3;
        return b - (a = a + b - (b = a));
    }
}

