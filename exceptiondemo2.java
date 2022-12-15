package test;

public class exceptiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = null;
		
		
try 
{
System.out.println(str.length());
}
		
catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
	System.out.println("Arithmetic Exception");
}
		
catch(NullPointerException e)
{
	System.out.println(e.getMessage());	
	System.out.println("Null pointer exception");	
}		
		
catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println("Exception");
}



	}

}
