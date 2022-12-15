package test;

public class dog implements animal {

	
     public void eat()
{
	System.out.println("dog is eating");
}
	
	
	public void sleeping ()
	{
		System.out.println("dog is sleeping");
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog d1 = new dog();
		d1.eat();
		d1.sleeping();
		
		
	}

}
