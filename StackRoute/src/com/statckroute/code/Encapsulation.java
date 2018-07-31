package com.statckroute.code;

class Encaps{
	private int a = 5;
	private float b = 5.5f;
	
	int getInt() {
		return a;
	}
	
	float getFloat() {
		return b;
	}
	
	void setInt(int x) {
		this.a = x;
	}
	
	void setFloat(float x) {
		this.b = x;
	}
}

public class Encapsulation {
	public static void main(String [] args) {
		Encaps ob = new Encaps();
		ob.setInt(5);
		ob.setFloat(5.5f);
		System.out.println(ob.getInt());
		System.out.println(ob.getFloat());
	}
}