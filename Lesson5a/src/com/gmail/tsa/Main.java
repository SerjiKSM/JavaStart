package com.gmail.tsa;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Input size");
		n = sc.nextInt();
		int[][] arr = createArray(n);
		printArray(arr);
		System.out.println("Summa = " + sum(arr));
		sc.close();

	}

	static int[][] createArray(int n) {
		int[][] arr = new int[n][n];
		Random rn = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = rn.nextInt(11);
			}
		}
		return arr;
	}

	static void printArray(int[][] arr) {
		for (int[] temp : arr) {
			for (int a : temp) {
				System.out.print(a + "\t");
			}
			System.out.println();
		}
	}

	static int sum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][arr.length - (i + 1)];
		}
		return sum;
	}
}
