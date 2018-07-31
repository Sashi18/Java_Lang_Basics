package com.stackroute.PE1;

import java.util.*;

public class Ex7 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Vector<Integer> v = new Vector<Integer>();
		int sum = 0;
		while(n != 0) {
			int x = n%10;
			if(x%2 == 0)
				sum += x;
			v.add(x);
			n /= 10;
		}
		Collections.sort(v, Collections.reverseOrder());
		n = 0;
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			n = n*10 + itr.next();
		}
		System.out.println("Sorted number in non-incresing order: "+n);
		System.out.println("Sum of even numbers: "+sum);
		if(sum > 15)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
