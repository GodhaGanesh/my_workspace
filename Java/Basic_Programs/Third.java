public class Third {
    public static void main(String[] args) {
        int space = 4;

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=space;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = i-1; j>=1;j--){
                System.out.print(j);
            }
            space--;
            System.out.println();
        }
    }
}