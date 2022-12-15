package test;

public class EmployeeConstructor1 {

	
	
      int  id;
	  int salary;
	  String name;
	static String companyName = "cognizant";
	 
	  EmployeeConstructor1()
	  {
	    id = 563;
	    salary =30000;
	    name = "nayan";  
	  }
	  
	  
	  EmployeeConstructor1(int id,int sal, String  name)
	  {
	  this.id= id;
	  salary  = sal;
	  this.name = name;
	  }
	  
	  
	  void ShowDetails()
	  {
	    System.out.println("id =" + id);
	    System.out.println("salary =" + salary);
	    System.out.println("name =" + name);
	    System.out.println("company name =" + companyName);    
	   
	    
	  }


	int calculatepf()
	{
		return salary*12/100;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		EmployeeConstructor1 e1= new EmployeeConstructor1();
	    e1.ShowDetails();
	    System.out.println(e1.calculatepf());
	    
	    
	    EmployeeConstructor1 e2= new EmployeeConstructor1(789,500000,"prakshal");
	    e2.ShowDetails();
		System.out.println(e2.calculatepf());
		
		
		
	}

}
