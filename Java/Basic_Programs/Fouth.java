public class Fouth {
    public static void main(String[] args) {
        int space = 0;

        for(int i = 5; i>=1; i--){
            for(int j = 1; j<=space;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = i-1; j>=1;j--){
                System.out.print(j);
            }
            space++;
            System.out.println();
        }
    }
}
