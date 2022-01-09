
public class Employee {
	private int eid;
	private String Ename;
	private double salary;

	public Employee() {
		System.out.println("Employee Object Started");
	}
    
	
	public void setId(int eid) {
		this.eid=eid;
	}
	public int getId(){
		return eid;
	}
	
	public void setEname(String Ename) {
		this.Ename=Ename;
	}
	
	public String getEname() {
		return Ename;
	}
	
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getsalary() {
		return salary;
	}
	
}
