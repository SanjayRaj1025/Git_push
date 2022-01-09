public class Dmo 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.setId(10);
		e.setEname("sanjay");
		e.setsalary(40000);
		
		int id=e.getId();
		
		String ename=e.getEname();
		
		double salary=e.getsalary();
		
		
		System.out.println(id);
		System.out.println(ename);
		System.out.println(salary);
		
		
		
	}

	

}
