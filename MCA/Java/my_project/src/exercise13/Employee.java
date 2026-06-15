package exercise13;

public class Employee {
    private String eid;
    private String ename;
    private double sal;

    public Employee(String eid, String ename, double sal) {
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
