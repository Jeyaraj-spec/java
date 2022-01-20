package com.mjr;

public class Component1 extends Component {

	public static void main(String[] args) {
		Component obj=new Component1();
		obj.move();
		obj.speed();
		

	}

	@Override
	void move() {
		System.out.println("Moving");
	}


}
