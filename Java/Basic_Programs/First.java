public class First {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<5; j++) {
                if (i>=j) {
                    System.out.print(j+1+" ");
                }
            }
            System.out.println();
        }
    }
}
