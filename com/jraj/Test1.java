package com.jraj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> arg1 = new ArrayList<String>();
		arg1.add("Jeyaraj");
		arg1.add("antu");
		arg1.add("rishi");
		arg1.add("Narayana");
		System.out.println(arg1);
	
		
		ArrayList<Integer> arg2 = new ArrayList<Integer>();
		arg2.add(17);
		arg2.add(23);
		arg2.add(67);
		arg2.add(45);
		System.out.println(arg2);
		
		ArrayList<String> arg3 = new ArrayList<String>();
		arg3.add("Jeyarajm");
		arg3.add("antuj");
		arg3.add("rishias");
		arg3.add("Narayanap");
		System.out.println(arg3);
		
		
		
		
		
		arg2.remove(1);
		System.out.println(arg2.remove(1));
		
		  arg1.clone();
		    System.out.println(arg1.clone());
		
		
		Iterator<String> it1=  arg1.iterator();
	    while(it1.hasNext())
	    System.out.println(it1.next());
	    
	    
	    Iterator<Integer> it2= arg2.iterator();
	    while(it2.hasNext())
	    System.out.println(it2.next());
	    
	    
	    System.out.println(arg1.clone());
	    
	    arg1.hashCode();
	    System.out.println(arg1.hashCode());
	    
	    arg1.size();
	    System.out.println(arg1.size());
	    
	   Set<String> s1= new TreeSet<String>();
	   s1.add("Chennai");
	   s1.add("Trichy");
	   s1.add("Tirunelveli");
	   s1.add("Madurai");
	   System.out.println(s1);
	   //s1.removeAll(s1);
	   System.out.println(s1.isEmpty());
	   
	    }

}
