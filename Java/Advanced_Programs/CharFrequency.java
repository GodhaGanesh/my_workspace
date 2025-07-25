import java.util.Scanner;
class CharFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a String :- ");
		String str = sc.nextLine();
		String uni = "";
		
		for (int i = 0; i<str.length();i++) {
			boolean flag = false;
			for(int j = 0;j<uni.length();j++)
				if(str.charAt(i)==uni.charAt(j))
					flag=true;
			if(flag == false)
				uni = uni + str.charAt(i);
		}
		for (int i = 0;i<uni.length();i++) {
			int count = 0;
			for (int j = 0;j<str.length();j++) {
				if(uni.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			System.out.println("'"+uni.charAt(i)+"'"+" -> "+count);
		}
	}
}
