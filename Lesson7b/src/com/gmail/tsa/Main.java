package com.gmail.tsa;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		renameFile("Folder");

	}

	static void renameFile(String foldername) {
		File aFolder = new File(foldername);
		if (!aFolder.exists() || !aFolder.isDirectory()) {
			System.out.println("Wrong input");
			return;
		}
		String[] filemanes = aFolder.list();
		for (String fname : filemanes) {
			String[] fn = fname.split("[.]");
			if (fn[fn.length - 1].compareTo("txt") == 0) {
				File newFile = new File(aFolder, fn[0] + "copy.txt");
				try {
					newFile.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
