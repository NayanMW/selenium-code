//WAP to print the largest element of   array



package test;

public class arrayloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num [] = { 12,25,36,48,58,69,48,63,68};
		  
		int max= num[0];
				
		
		for( int i=1; i<9 ;i++)
		{
			if (num[i]>max)
			{
				
				max = num [i];
				
			}
				
		}
		
		{
			System.out.println("max ="+max);
		}
		
		
		
	}

	}


