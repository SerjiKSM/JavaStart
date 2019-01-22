package com.gmail.tsa;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rn = new Random();
		int col = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(11);
			System.out.print(arr[i] + " ");
		}
		
		for (int i : arr) {
			col=(i%2==1)?col+1:col;
		}
		
		System.out.println();
		System.out.println(col);

	}

}
