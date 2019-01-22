package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double x1 = 0;
		double y1 = 0;
		System.out.println("Input x point A");
		x = sc.nextDouble();
		System.out.println("Input y point A");
		y = sc.nextDouble();
		System.out.println("Input x point B");
		x1 = sc.nextDouble();
		System.out.println("Input y point B");
		y1 = sc.nextDouble();

		System.out.println((x * x1 > 0) && (y * y1 > 0) ? "YES" : "NO");

		sc.close();
	}

}
