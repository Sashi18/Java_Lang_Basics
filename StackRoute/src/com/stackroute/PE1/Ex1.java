package com.stackroute.PE1;

import java.util.*;

class Functions{
	boolean isPallindrome(String x) {
		StringBuilder a = new StringBuilder();
		a.append(x);
		String b = a.reverse().toString();
		if(x.equals(b))
			return true;
		return false;
	}
	
	boolean sumCheck(String x, int c) {
		String [] arr = x.split("");
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			int n = Integer.parseInt(arr[i]);
			if(n%2 == 0)
				sum += n;
		}
		if(sum > c)
			return true;
		return false;
	}
}

public class Ex1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		Functions ob = new Functions();
		if(ob.isPallindrome(n) && ob.sumCheck(n, 25))
			System.out.println(n+" is a Pallindrome and sum is greater than 25");
		else if(ob.isPallindrome(n) || ob.sumCheck(n, 25))
			System.out.println(n+" is a Pallindrome and sum is less than 25");
		else
			System.out.println("String is not a Pallindrome");
	}
}
