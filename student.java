package test;

public class student {

	
	int rollno ;
	String name;
	
	
	
	void showdetails ()
	
	{
		
		System.out.println("roll no =" + rollno);
		
		System.out.println("name =" + name);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 student s1 = new student ();
		 
		 s1.rollno = 1;
		 s1.name = "nayan wadekar";
		 s1.showdetails();
		 
		 
		 student s2  = new student ();
		 
		 s2.rollno = 5;
		 s2.name = "harsh";
		 s2.showdetails();
		 
		
		
		
		
		
		
		
		
	}

}
