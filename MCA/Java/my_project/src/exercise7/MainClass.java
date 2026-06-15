package exercise7;

import exercise7.users.Student;

public class MainClass {
    public static void main(String[] args) {
        Student ganesh = new Student("Godha Ganesh Viswanadham", 325203320046L, "MCA");
        ganesh.assginAcademics(26);
        System.out.println(ganesh);
        ganesh.getReport();
        System.out.println(ganesh.rep.getAcademicMarks());
        System.out.println(ganesh.rep.getSportsMarks());

        Student shyam = new Student("Aalla Shyam", 325203320040L,"MCA");
        shyam.assginAcademics(40);
        System.out.println(shyam);
        shyam.getReport();
        System.out.println(shyam.rep.getAcademicMarks());
        System.out.println(shyam.rep.getSportsMarks());
    }
}