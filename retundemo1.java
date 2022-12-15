package test;

public class retundemo1 {

	
	int a, b, c ,d;
	
	
	int mul (int a, int b)
	{
		return a*b;
	}
	
	
	int mul (int a , int b, int c)
	{
		return a*b*c ;
	}
	
	
	double mul (double a, double b)
	{
		return a*b;
	}
	
	
	double mul (double a, double b, double c)
	{
		return a*b*c;
	}
	
	
	int mul ( int a, int b, int c, int d)
	{
		return a*b*c;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		retundemo1 r1 = new retundemo1();
		
		System.out.println(r1.mul(85, 052));
				
		System.out.println(r1.mul(52,89,35));
		
		System.out.println(r1. mul (85.2,69.5,48.36));
		
		System.out.println(r1. mul (54.3,95.7));

		System.out.println(r1 . mul (45,68,23,94));
		
	}

}
