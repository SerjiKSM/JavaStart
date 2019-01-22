package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Input number");
		n = sc.nextInt();
		if (isPalindrome(n)) {
			System.out.println(n + " is palindrome");

		} else {
			System.out.println(n + " is not palindrome");
		}
		sc.close();
	}

	static boolean isPalindrome(int x) {
		StringBuffer sb = new StringBuffer();
		sb.append(x);
		return sb.toString().equals(sb.reverse().toString());
	}

}
