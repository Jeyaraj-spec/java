package com.collection;

import java.util.*;
//Iterator vector
public class Test2 {

	public static void main(String[] args) {
		Vector vr=new Vector();
		vr.add("Redmi");
		vr.add("Vivo");
		vr.add("Oppo");
		vr.add("samsung");
		System.out.println(vr);
		Iterator it1=vr.iterator();
		while(it1.hasNext())
			System.out.println(it1.next());

	}

}
