package oops_pragramming_style2;

public class Developer {
	public String developerName;
    public int yearsOfExperience = 3;
    public double salary = 15000;
    public static String companyName = "TCS";
    
    public void intakeDetails(String ename, double sal, int yoe) {
    	developerName = ename;
    	salary = sal;
    	yearsOfExperience = yoe;
    }
    public void displayDetails() {
    	System.out.println("Developer Name : "+developerName);
        System.out.println("Company Name : "+companyName);
        System.out.println("Salary (per Month) : "+salary);
        System.out.println("Salary (Annual) : "+(salary*12));
        System.out.println("Experience (inYears) : "+yearsOfExperience);
        System.out.println("Experience (inMonths) : "+yearsOfExperience*12);
    }
}
