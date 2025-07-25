public class Seventh {
    public static void main(String[] args) {
        int a = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (a<10) {
                    System.out.print("0"+a + " ");
                }
                else{
                    System.out.print(a + " ");
                }
                a++;
            }
            System.out.println();
        }
    }
}
