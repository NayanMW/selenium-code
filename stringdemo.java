package test;



public class stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "hsyjen"; 
		
		String rev = " ";
		
		for(int i= str.length()-1;i>=0;i--)
		{
		   rev = rev+str.charAt(i);	
		}
		
		System.out.println("the String = "+str+" Reverse String = "+rev );
		
		if (str.equals(rev))
		{
			System.out.println("pallindrom");
		}
		else 
		{
			System.out.println("no pallindrom");
		}
		
	}

}
