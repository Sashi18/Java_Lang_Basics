package com.statckroute.code;

interface Comm{
	public float area(float a);
}

class Area implements Comm{
	@Override
	public float area(float a) {
		// TODO Auto-generated method stub
		return a*a;
	}
	
	public float area(float a, float b) {
		return a*b;
	}
}

class Square extends Area{
	void getArea() {
		System.out.println("Area of square with side 5: "+area(5));
	}
}

class Rectangle extends Area{
	void getArea() {
		System.out.println("Area of Rectangle with sides 5, 8: "+area(5, 8));
	}
}

public class Polymorphism {
	public static void main(String [] args) {
		Square ob1 = new Square();
		Rectangle ob2 = new Rectangle();
		ob1.getArea();
		ob2.getArea();
	}
}
