package exercise1;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Time in (hh mm ss (am/pm) format : ");
		String time[] = sc.nextLine().split(" ");
		int hh = Integer.parseInt(time[0]);
		String mer = time[3];
		if(mer.equals("pm") && hh != 12) hh = hh + 12;
		else if(mer.equals("am") && hh == 12) hh = hh - 12;
		System.out.print(hh + " " + time[1]+" "+time[2]);
		sc.close();
	}
}
