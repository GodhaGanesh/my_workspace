package list_programs;
import java.util.ArrayList;
public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("hii");
		al.add("hello World");
		al.add(true);
		al.add(0,false);
		System.out.println(al);
		al.remove(2);
		System.out.println(al.size());
		System.out.println(al);
		
	}
}
