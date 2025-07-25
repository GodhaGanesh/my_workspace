class Multiplication{
	public void displayTable(int num){
		for (int i = 1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
	public static void main(String[] args){
		Multiplication multiplication = new Multiplication();
		multiplication.displayTable(5);
		System.out.println("*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
		multiplication.displayTable(7);
	}
}