package exercise11;
import javax.swing.*;
public class TableExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Table");

        String data[][] = {
                {"46", "Ganesh", "85"},
                {"47", "Siva Kumar", "90"},
                {"40", "Shyam", "100"},
                {"27", "Teja", "88"}
        };

        String column[] = {"ID", "Name", "Marks"};

        JTable table = new JTable(data, column);

        JScrollPane sp = new JScrollPane(table);

        frame.add(sp);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}