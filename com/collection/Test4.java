package com.collection;

import java.util.Stack;

//Stack
public class Test4 {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("java");
		st.push("latest");
		st.push("edition");
		st.push("-fifth");
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.search("edition"));
		System.out.println(st.pop());
		System.out.println(st);

	}

}
