import java.util.Scanner;
class StringMethods
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the String:-");
        String str = sc.nextLine();

        System.out.println("upper case of entered string :-"+str.toUpperCase());
        System.out.println("lower case of entered string :-"+str.toLowerCase());

        
    }
}