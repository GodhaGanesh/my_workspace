package throws_programming;

public class Demo {
	public static void start() throws ArithmeticException {
		System.out.println(10/0);
	}
	public static void run() throws ArithmeticException {
		start();
	}
	public static void stop()throws ArithmeticException {
		run();
	}
	public static void main(String[] args) {
		try {
			stop();
		}
		catch(ArithmeticException e) {
			System.out.println("handeld");
		}
	}
}
