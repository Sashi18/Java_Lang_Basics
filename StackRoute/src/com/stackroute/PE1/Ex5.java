package com.stackroute.PE1;

import java.util.*;

public class Ex5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String [] arr = str.split(" ");
		int sum  = 0;
		for(int i = 0;i < arr.length;i++)
			sum += Integer.parseInt(arr[i]);
		System.out.println(sum);
	}
}
