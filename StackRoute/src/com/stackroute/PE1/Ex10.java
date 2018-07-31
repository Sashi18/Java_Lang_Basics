package com.stackroute.PE1;

import java.util.*;

class Function{
	void func(String s, int n) {
		int l = s.length();
		if(l < n)
			return;
		int val = l - n;
		System.out.print(s);
		String [] str = s.split("");
		String st = "";
		for(int i = val;i < l;i++) {
			st += str[i];
		}
		while(n != 0) {
			System.out.print(st);
			n--;
		}
	}
}

public class Ex10 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		Function ob = new Function();
		ob.func(str, n);
	}
}
