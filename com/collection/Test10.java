package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test10 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("11");
		al.add("23");
		al.add("33");
		al.add("56");
		
		ListIterator li=al.listIterator();
		System.out.println("Traversing arraylist in forward direction using listiterator");
		while (li.hasNext())
		{
			System.out.println(li.next());
		
		}
		System.out.println("Traversing arraylist in reverse direction using listiterator");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
			
		}
	}

}
