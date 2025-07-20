package oops_programming_revision;

public class MainClass {
	public static void main(String[] args) {
		ArrayOps arrayOps = new ArrayOps();
		int i = 100;
		while (i>0) {
			arrayOps.insertInArray(i);
			i--;
		}
		
		ArrayOps.printArray();
	}
}
