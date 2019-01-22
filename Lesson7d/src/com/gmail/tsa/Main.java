package com.gmail.tsa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceCharIntoFile("a.txt", 'l', 'r');
	}

	static String change(String line, char a, char b) {
		String newline = line.replace(a, b);

		return newline;
	}

	static void replaceCharIntoFile(String filename, char a, char b) {
		StringBuilder sb = new StringBuilder();
		File aFile = new File(filename);
		if (!aFile.exists() || aFile.isDirectory()) {
			System.out.println("Error");
			return;
		}
		try (BufferedReader br = new BufferedReader(new FileReader(aFile))) {
			String temp = "";
			for (; (temp = br.readLine()) != null;) {
				sb.append(change(temp, a, b) + "\n");
			}
		} catch (IOException e) {

		}
		try (PrintWriter pw = new PrintWriter(aFile)) {
			pw.println(sb.toString());
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
