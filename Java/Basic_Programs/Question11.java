public class Question11 {
    public static void main(String[] args) {
        int[] a = {1, 1, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.print(a[i]+" -> "+count);
            System.out.println();
        }
    }
}
