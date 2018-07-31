package com.stackroute.PE1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(n%2 != 0 && (n > 20 && n <= 30))
			System.out.println("Tom");
		else if(n%2 == 0 && (n > 20 && n < 30))
			System.out.println("Jerry");
	}
}
