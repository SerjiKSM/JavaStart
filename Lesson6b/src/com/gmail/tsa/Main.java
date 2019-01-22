package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		check(1);
		check(9);
		check(41);
		check(22);
	}

	static void check(int x) {
		StringBuffer sb = new StringBuffer();
		sb.append(x + "=>");
		sb.append(((x & 1) > 0) ? "CLOSE=YES " : "CLOSE=NO ");
		sb.append(((x & 8) > 0) ? "HTTP_1.1=YES " : "HTTP_1.1=NO ");
		sb.append(((x & 32) > 0) ? "GET=YES " : "GET=NO ");
		System.out.println(sb.toString());
	}
}
