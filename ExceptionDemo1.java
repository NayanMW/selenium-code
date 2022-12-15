package test;

public class ExceptionDemo1 {

	

	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a []= new int [5];
		
		
	try {	
		a[0]=10;
		a[1]=45;
	    a[2]=89;
		a[3]=56;
		a[4]=28;
		a[5]=25;
	}	
		
	catch(Exception e)
	{
		System.out.println("Exception");

	}

	for (int i=0;i<=4;i++)
	{
		System.out.println(a[i]);
	}
			

	
}
}