package exercise15;
import java.util.Vector;
public class VectorWrapperDemo {
    public static void main(String[] args) {
        Vector<Integer> marks = new Vector<>();

        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(95);

        System.out.println("Student Marks:");
        for (Integer mark : marks) {
            System.out.println(mark);
        }

        Integer firstMark = marks.get(0);
        System.out.println("\nFirst Mark: " + firstMark);

        String numStr = "100";
        Integer num = Integer.parseInt(numStr);

        System.out.println("Converted Integer: " + num);

        String str = num.toString();
        System.out.println("Converted String: " + str);

        int value = num;
        System.out.println("Unboxed Value: " + value);
    }
}
