package com.collection;
//arraylist
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("a");
		ar.add("b");
		ar.add("c");
		ar.add("d");
		ar.add("e");
		System.out.println(ar);
		System.out.println("Initial size of the array:"+ar.size());
		System.out.println("Contents of the array:"+ar);
		ar.add(5,"g");
		System.out.println(ar);
		
	}

}
