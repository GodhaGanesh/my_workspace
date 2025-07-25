public class ConcentricSelf {
    public static void main(String[] args) {
        int n = 5;
        int rowcol = 2 * n - 1;
        int star = rowcol;
        int space = 0;
        int temp = n;

        for(int i =0; i<rowcol; i++){
            for (int j=0; j<space;j++){
                System.out.print((temp--)+"  ");
            }
            for (int j=0; j<star;j++){
                System.out.print(n+"  ");
            }
            for (int j=0; j<space;j++){
                System.out.print((++temp)+"  ");
            }
            if(i < rowcol/2){
                star -= 2;
                space++;
                n--;
            }else{
                star += 2;
                space--;
                n++;
            }
            System.out.println();
        }

    }
}
