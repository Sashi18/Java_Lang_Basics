package com.stackroute.PE1;

import java.util.Scanner;

public class Ex4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a = 1;
		for(int i = 0;i < n;i++, a++) 
			for(int j = 0;j < i+1;j++)
				System.out.print(a);
	}
}
