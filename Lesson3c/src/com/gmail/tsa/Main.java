package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double fact = 1;
		System.out.println("Input n");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println(n + "!=" + fact);
		sc.close();
	}

}
