package com.collection;

import java.util.HashMap;

//hashmap
public class Test5 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("Name", "Jraj");
		hm.put("Age","22");
		System.out.println(hm);
		System.out.println(hm.get("Name"));
		System.out.println(hm.get("Age"));

	}

}
