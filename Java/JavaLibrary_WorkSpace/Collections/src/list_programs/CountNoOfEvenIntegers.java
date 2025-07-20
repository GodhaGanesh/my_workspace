package list_programs;

import java.util.ArrayList;

public class CountNoOfEvenIntegers {
	public static void main(String[] args) {
		ArrayList nums = new ArrayList();
		nums.add(10);
		nums.add(20);
		nums.add(67);
		nums.add(62);
		nums.add(83);
		int count = 0;
		for(int i = 0; i< nums.size();i++)
			if(((int)nums.get(i))%2 == 0)
				count++;
		System.out.println(count);
	}
}
