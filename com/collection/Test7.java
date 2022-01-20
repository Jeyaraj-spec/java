package com.collection;
//properties
/*import java.util.Enumeration;
import java.util.Properties;*/
import java.util.*;

public class Test7 {

	public static void main(String[] args) {
		Properties prop=System.getProperties(); 
		Enumeration em=prop.propertyNames();
		
		while(em.hasMoreElements())
		{
			String nam=(String)em.nextElement();
			String val=prop.getProperty(nam);
			System.out.println("prop name is" + nam + "  :value is"+ val);
		} 

	}

}
