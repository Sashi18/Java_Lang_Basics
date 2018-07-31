package com.statckroute.code;

interface Inner{
	public void getAge(int a);
}

public class AnonyInner {
	public static void main(String [] args) {
		Inner ob = new Inner() {
			public void getAge(int a) {
				System.out.println("Age is: "+a);
			}
		};
		ob.getAge(21);
	}
}
