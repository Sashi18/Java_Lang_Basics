package com.stackroute.PE1;

import java.util.*;

public class Ex3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char [] ch = str.toCharArray();
		for(int i = 0;i < ch.length;i++) {
			if((ch[i]>=65 && ch[i]<= 90) || (ch[i]>=97 && ch[i]<=122)) {	
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i]=='u') {
					System.out.print("Vowel ");
				}
				else
					System.out.print("Consonent ");
			}
			else {
				System.out.println("Not an Alphabet.");
				System.exit(0);
			}
		}
	}
}
