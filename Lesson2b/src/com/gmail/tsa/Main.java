package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {

		double s = 20.0;
		double length = 0.75;
		double weigth = 0.15;
		int number = 0;
		double colvo = s / (length * weigth);
		colvo = Math.ceil(colvo);
		number = (int) (Math.ceil(colvo / 13));
		System.out.println("Нужно половиц "+colvo);
		System.out.println("Нужно пачек "+number);
		
	}

}
