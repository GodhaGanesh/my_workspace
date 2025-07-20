package list_programs;

import java.util.ArrayList;

public class TaskProgram {
	public static void main(String[] args) {
		ArrayList<Object> names = new ArrayList<Object>();
		names.add("Tom");
		names.add("charan");
		names.add("anand");
		names.add("Ganesh");
		names.add("Mala");
		names.add("Laila");
		names.add("Ram");
		
		for(int i = 0; i<names.size();i++) {
			String name = (String)names.get(i);
			System.out.println(name+" : "+name.charAt(name.length()-1));
		}
	}
}
