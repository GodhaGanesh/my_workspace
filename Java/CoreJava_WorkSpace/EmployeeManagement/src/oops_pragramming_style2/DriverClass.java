package oops_pragramming_style2;

public class DriverClass {

	public static void main(String[] args) {
        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        developer1.intakeDetails("Priyanka Gandhi",30000.56,4);
        developer2.intakeDetails("Rahul Gandhi",20000.999,14);
        
        System.out.println("------------ Developer 1 Details-----------");
        developer1.displayDetails();
        System.out.println("------------ Developer 2 Details-----------");
        developer2.displayDetails();
	}
}