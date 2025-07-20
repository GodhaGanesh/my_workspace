package oops_programming_abstract;

abstract class A {
	abstract public void show();
	abstract public void hide();
}
abstract class B extends A {

	@Override
	public void show() {
		System.out.println("Showing The method in Class B");
	}
}

class C extends B {
	@Override
	public void hide() {
		System.out.println("Hiding The method in Class C");
	}
}

public class DriverClass2 {
	public static void main(String[] args) {
		new C().show();
		new C().hide();
		
	}
}
