package tostring_programs;

public class Employee {

	private String name;
	private int sal;
	private int id;

	public Employee() {
	}

	public Employee(String name, int sal, int id) {
		this.name = name;
		this.sal = sal;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
