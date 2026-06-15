package exercise13;

import exercise13.Employee;
import java.util.Scanner;
import java.util.HashMap;

public class EmployeeHashMap {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Employee> empMap = new HashMap<>();
        System.out.print("How many employees you need to add: ");
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= count; i++) {

            System.out.println("Enter Employee " + i + " Details");

            System.out.print("Employee ID: ");
            String eid = sc.nextLine();

            System.out.print("Employee Name: ");
            String ename = sc.nextLine();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            Employee emp = new Employee(eid, ename, sal);

            empMap.put(eid, emp);
        }

        System.out.println("Map Size: "+empMap.size());

        System.out.println("Enter Employee Id to search their details: ");
        String id = sc.nextLine();

        Employee emp = empMap.get(id);

        if (emp == null){
            System.out.println("No such Employee/ invalid ID");
            sc.close();
            return;
        }
        System.out.println("\nEmployee Found");
        System.out.println("ID: " + emp.getEid());
        System.out.println("Name: " + emp.getEname());
        System.out.println("Salary: " + emp.getSal());
        sc.close();
    }
}
