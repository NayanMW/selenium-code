package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String>list1 =new ArrayList <String>();
		
		list1.add("abc");
		list1.add("ccc");
		list1.add("ddd");
		list1.add("xxx");
		
		System.out.println("before sorting");
		Iterator<String> it = list1.iterator();
		
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	System.out.println("after sorting");
	
	Collections.sort(list1);
	
	Iterator<String> it1 = list1.iterator();
	
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	
	
	
	
	
	}

}
