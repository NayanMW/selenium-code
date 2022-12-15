package test;

public class Stringdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " java program";
	char ch = 'a';
		int count =0;
		
		for (int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		
		}
				
	System.out.println(" count of a in given String =" + count);		
		
		
	}

}
