package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = 20.0;
		System.out.print("Введите расстояние поездки ");
		double r = sc.nextDouble();
		double totalprice = 6.0 / 100.0 * price * 2 * r;
		System.out.println("Вы потратите " + totalprice + " гривен");
		sc.close();
	}

}
