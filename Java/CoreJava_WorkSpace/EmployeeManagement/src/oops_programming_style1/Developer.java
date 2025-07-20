package oops_programming_style1;

public class Developer {
    public String developerFirstName;
    public String developerLastName;
    public int yearsOfExperience = 3;
    public double salary = 15000;
    public static String companyName = "TCS";
    
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        developer1.developerFirstName = "Priyanka";
        developer1.developerLastName = "Gandhi";
        developer1.yearsOfExperience = 4;
        developer1.salary = 30000.56;

        developer2.developerFirstName = "Rahul";
        developer2.developerLastName = "Gandhi";
        developer2.yearsOfExperience = 14;
        developer2.salary = 20000.999;

        System.out.println("-----------Developer 1 Details-----------");
        System.out.println("Developer Name : "+developer1.developerFirstName+" "+developer1.developerLastName);
        System.out.println("Company Name : "+companyName);
        System.out.println("Salary (per Month) : "+developer1.salary);
        System.out.println("Salary (Annual) : "+(developer1.salary*12));
        System.out.println("Experience (inYears) : "+developer1.yearsOfExperience);
        System.out.println("Experience (inMonths) : "+developer1.yearsOfExperience*12);

        System.out.println("-----------Developer 2 Details-----------");
        System.out.println("Developer Name : "+developer2.developerFirstName+" "+developer2.developerLastName);
        System.out.println("Company Name : "+companyName);
        System.out.println("Salary (per Month) : "+developer2.salary);
        System.out.println("Salary (Annual) : "+(developer2.salary*12));
        System.out.println("Experience (inYears) : "+developer2.yearsOfExperience);
        System.out.println("Experience (inMonths) : "+developer2.yearsOfExperience*12);
    }
}
