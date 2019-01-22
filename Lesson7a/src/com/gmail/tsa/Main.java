package com.gmail.tsa;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		File ff = new File(".");
		try {
			if (!ff.exists()) {
				ff.createNewFile();
			}
		} catch (IOException e) {
			pw.println("ERROR!");
		}

		File a = new File("Folder");
		a.mkdirs();
		File b = new File(a, "a.txt");
		try {
			if (!b.exists()) {
				b.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		b.delete();
		a.delete();

		File f1 = new File(ff.getAbsolutePath());
		if (f1.isDirectory()) {
			String[] S = f1.list();

			for (int i = 0; i < S.length; i++) {

				pw.println(S[i]);
			}
		}
	}
}