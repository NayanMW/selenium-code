//WAp to find lowest element of array







package test;


public class arrayloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num [] = { 12,25,36,48,58,69,48,63,68};
		  
		int min= num[0];
				
		
		for( int i=1; i<9 ;i++)
		{
			if (num[i]<min)
			{
				
				min = num [i];
				
			}
				
		}
		
		{
			System.out.println("min ="+min);
		}
		
		
		
	}

}
