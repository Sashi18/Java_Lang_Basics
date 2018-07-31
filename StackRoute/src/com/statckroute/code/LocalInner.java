package com.statckroute.code;

public class LocalInner {
	public static void main(String [] args) {
		class Inner{
			int sum(int a, int b) {
				return (a+b);
			}
		}
		Inner a = new Inner();
		System.out.println(a.sum(10, 25));
	}
}
