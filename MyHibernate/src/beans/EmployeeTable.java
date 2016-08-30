package beans;
//Adding another Comment
public class EmployeeTable {
	private String id;
	private String name;
	private String desig;
	private int salary;
	
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesig() {
		return desig;
	}
	public int getSalary() {
		return salary;
	}
	
}
