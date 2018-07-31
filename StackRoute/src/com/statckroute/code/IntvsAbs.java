package com.statckroute.code;
import java.lang.Math;

abstract class A{
	abstract int add(int a, int b);
	int mul(int a, int b) {
		return a*b;
	}
}

interface B{
	public int div(int a, int b);
	public int sub(int a, int b); 
}

public class IntvsAbs extends A implements B {
	public static void main(String [] args) {
		IntvsAbs a = new IntvsAbs();
		//B b = new IntvsAbs();
		System.out.println(a.mul(5, 5));
		System.out.println(a.add(5, 5));
		System.out.println(a.div(15, 5));
		System.out.println(a.sub(15, 5));
	}

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (Math.abs(a-b));
	}
}
