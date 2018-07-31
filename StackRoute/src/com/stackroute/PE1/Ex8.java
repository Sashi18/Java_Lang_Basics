package com.stackroute.PE1;

import java.util.*;

class Limit{
	private int numb;
	void setLimit(int a) {
		if(a <= 100 && a >= 1)
			numb = a;
		else {
			System.out.println("Out of Range");
			System.exit(0);
		}
	}
	
	int getNumber() {
		return numb;
	}
}

public class Ex8 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial number in range of 1 to 100");
		int n = sc.nextInt();
		System.out.println("Enter a guess in range 1 to 100");
		while(true) {
			int x = sc.nextInt();
			Limit ob = new Limit();
			ob.setLimit(x);
			if(x > n)
				System.out.println("Number guessed is more than original number");
			else if(x < n)
				System.out.println("Number guessed is less than original number");
			else if(x == n) {
				System.out.println("Number guessed is equal to original number");
				break;
			}
		}
		sc.close();
	}
}
