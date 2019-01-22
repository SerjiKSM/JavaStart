package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("Input a");
		a = sc.nextInt();
		System.out.println("Input b");
		b = sc.nextInt();
		System.out.println("Input c");
		c = sc.nextInt();

		if (a < b) {
			a = b;
		}
		if (a < c) {
			a = c;
		}

		System.out.println("Max = "+a);
		sc.close();
	}

}
