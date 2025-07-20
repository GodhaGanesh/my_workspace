package list_programs;

import java.util.ArrayList;

public class TaskProgram2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add("API");
		al.add("CloudComputing");
		al.add("MicroServices");
		al.add("Analyst");
		al.add("SQL");
		int index;
		int max = ((String)al.get(index = 0)).length();
		for(int i = 0; i<al.size();i++) {
			String name = (String)al.get(i);
			if(max<name.length()) {
				max = name.length();
				index = i;
			}
		}
		System.out.println(al.get(index));
	}
}
