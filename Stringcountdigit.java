//wap to count sum of digit in string

package test;

public class Stringcountdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="sd2dfg6fe3dgffd98";
		
		int sum = 0;
		
		
		for(int i=0;i<str.length();i++)
		{   
		    char temp=str.charAt(i);
		    if (Character.isDigit(temp))
		    { 
		        int b =Character.getNumericValue(temp);
		
		        sum=sum+b;
		        
		    }
		    
		}    
		System.out.println(sum);
	}

}
