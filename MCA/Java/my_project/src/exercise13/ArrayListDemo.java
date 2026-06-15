package exercise13;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++)
            lst.add(i*10);

        lst.remove(3);

        System.out.println(lst.get(2));

        System.out.println(lst.size());

        lst.forEach((num) ->{
            System.out.print(num+" ");
        });
    }
}
