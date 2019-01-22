package com.gmail.tsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		Random rn = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = rn.nextInt(10);
			}
		}

		saveArray(arr, "mas.txt");

	}

	static void saveArray(int[][] arr, String filename) {
		try (PrintWriter pw = new PrintWriter(filename)) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					pw.print(arr[i][j] + "\t");
				}
				pw.println();
			}
			System.out.println("Save array in " + filename + " is done");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
