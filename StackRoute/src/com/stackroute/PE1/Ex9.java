package com.stackroute.PE1;

import java.util.*;

public class Ex9 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String [] s = str.split("");
		String st = "";
		for(int i = s.length-1;i >= 0;i--) {
			st += s[i];
		}
		System.out.println(st);
	}
}
