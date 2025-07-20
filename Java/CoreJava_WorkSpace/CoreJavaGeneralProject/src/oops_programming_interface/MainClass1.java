package oops_programming_interface;

interface Mail {
	public void inbox();
}

class Gmail {
	public void inbox() {
		System.out.println("You have 1 message!!");
	}
}

class App extends Gmail implements Mail{
	
}
public class MainClass1 {
	public static void main(String[] args) {
		App a1 = new App();
		a1.inbox();
	}
}
