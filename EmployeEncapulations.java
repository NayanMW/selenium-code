package test;

public class EmployeEncapulations {

	
	private int employeId;
	private int salary;
	
	public void setemployeId(int employeId)
	{
		this.employeId = employeId;
	}
	
	
	public int getemployedId()
	{
		return employeId;
	
	}
	
	
	public void setesalary(int salary)
	{
		this.salary=salary;
	}
	
	
	public int getsalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeEncapulations e1 = new EmployeEncapulations();
		
		e1.setemployeId(4589);
		
		e1.setesalary(30000);
		
		System.out.println("emoployeid =" + e1.getemployedId());
		
		System.out.println("employe salary =" + e1.getsalary());
		
		
	}

}
