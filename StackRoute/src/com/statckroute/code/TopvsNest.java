package com.statckroute.code;

public class TopvsNest {
	public static void main(String [] args) {
		TopvsNest ob = new TopvsNest();
		Nested ob1 = ob.new Nested();
		ob1.func();
	}
	
	class Nested{
		void func() {
			System.out.println("This is a Nested Class");
		}
	}
}
