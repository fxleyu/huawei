package com.huawei.page01.pro1965;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(reserString(scanner.nextLine()));
		scanner.close();
	}

	private static String reserString(String nextLine) {
		char[] chs = nextLine.toCharArray();
		int i=0;
		int j= chs.length-1;
		while(i<j){
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
			i++;
			j--;
		}
		return new String(chs);
	}

}
