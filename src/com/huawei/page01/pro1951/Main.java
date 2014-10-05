package com.huawei.page01.pro1951;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(reverChars(scanner.nextLine().trim()));
		scanner.close();
	}

	private static String reverChars(String string) {
		char[] result = string.toCharArray();
		reverCharArray(result);
		return new String(result);
	}

	private static void reverCharArray(char[] result) {
		int i = 0;
		int j = result.length-1;
		while(i<j){
			char temp = result[i];
			result[i] = result[j];
			result[j] = temp;
			i++;
			j--;
		}
	}

}
