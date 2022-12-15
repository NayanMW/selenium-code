package test;

public class switchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int months = 5;
		
		//{1,2,3,4,5,6,7,8,9,10,11,12,invalid}
		switch(months)
		{
		case 1 :
			System.out.println("january");
			break;
		case 2 :
			System.out.println("fabruary");
		break;
		case 3 :
			System.out.println("march");
			break;
		case 4 :
			System.out.println("april");
			break;
		case 5 :
			System.out.println("may");
			break;
		case 6 :
			System.out.println("june");
			break;
		case 7 :
			System.out.println("july");
			break;
		case 8 :
			System.out.println("augaust");
			break;
		case 9 :
			System.out.println("september");
			break;
		case 10 :
			System.out.println("october");
			break;
		case 11 :
			System.out.println("november");
			break;
		case 12 :
			System.out.println("december");
			break;
			
			default :
				System.out.println("invalid");
				
		}
	}

}
