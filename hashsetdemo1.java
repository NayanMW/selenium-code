package test;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set1 =new HashSet<String>();
		
		set1.add("sanket");
		set1.add("natan");
		set1.add("dajag");
		set1.add("shjen");
		
		Iterator<String> it = set1.iterator();
		while(it.hasNext())
				{
			System.out.println(it.next());
				}
		
		
		
		
	}

}
