public class Eleventh {
    public static void main(String[] args) {
        int space = 4;
        for(int i=1;i<=5;i++){
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
    }
}
