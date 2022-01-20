package com.collection;
//map
import java.util.HashMap;
import java.util.Map;

public class Test6 {
	
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("eid", "45");
		m.put("ename","Jraj");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		//System.out.println(m);
		System.out.println(m.get("eid"));
	}

}
