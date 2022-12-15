package test;

import java.util.HashMap;

public class hashmapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> people = new HashMap<String,Integer>();
		
		people.put("nayan", 24);
		people.put("devang", 56);
		people.put("jagsynb", 65);
		people.put("ghebkl", 89);
		
		for(String i: people .keySet())
		{
			System.out.println("key =" + i   +  "  value ="   + people.get(i));
		
		}
	}

}
