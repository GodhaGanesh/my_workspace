package exercise8;

import java.util.Scanner;

class NotEligibleException extends Exception{
    @Override
    public String getMessage() {
        return "You are not eligible";
    }
}

public class UserException {
    public static boolean vote = false;
    public static boolean applied = false;

    public static void vote(int age) throws NotEligibleException{
        if (age >= 18) vote = true;
        else throw new NotEligibleException();
    }

    public static void applyInternship(float per) throws NotEligibleException{
        if (per >= 60 && per <= 100) applied = true;
        else throw new NotEligibleException();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        try{
            vote(age);
        } catch (NotEligibleException e) {
            System.out.println("oops!! "+e.getMessage()+" age should be >=18");
        } finally {
            System.out.println("is Voted: "+vote);
        }
        System.out.print("Enter your Percentage : ");
        float per = sc.nextInt();
        try{
            applyInternship(per);
        } catch (NotEligibleException e) {
            System.out.println("oops!! "+e.getMessage()+" percentage should be >=60");
        } finally {
            System.out.println("is Applied: "+applied);
            sc.close();
        }
    }
}