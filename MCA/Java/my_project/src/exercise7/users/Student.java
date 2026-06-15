package exercise7.users;

import exercise7.academic.Report;

public class Student {
    public String name;
    public String dept;
    public long rollNo;
    public Report rep;

    public Student(String name, long rollNo, String dept) {
        this.name = name;
        this.dept = dept;
        this.rollNo = rollNo;
    }

    public void assginAcademics(int x){
        rep = new Report(x);
    }

    public void getReport(){
        System.out.println("Name: "+name);
        System.out.println(rep);
    }

    @Override
    public String toString() {
        return name + " ("+dept+"), " + rollNo+"\n"+"--------------------------------------------\n"+rep;
    }
}
