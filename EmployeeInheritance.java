package test;

public class EmployeeInheritance  extends  EmployeeConstructor1{

	
	int medical;
	
	
	EmployeeInheritance()
	{
		super();
		medical = 4000;
		
	}
	
	
	EmployeeInheritance(int id,int sal, String name ,int medical  )
	{
	super.id= id;
    super.salary= sal;
	super.name= name;
		this.medical =medical;
		
	}


	//overriding
	
	void showDetails()
	{
		super.ShowDetails();
		System.out.println("medical =" + medical);
		
	}
	
	int calculatepf ()
	{
		return super.calculatepf();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EmployeeInheritance e1 = new EmployeeInheritance ();
		e1.showDetails();
		
	System.out.println(e1.calculatepf());
		
		
	
	EmployeeInheritance e2 = new EmployeeInheritance (789,500000,"prakshal",5000);
	e2.showDetails();
	
	System.out.println(e2.calculatepf());
	
	}

}
