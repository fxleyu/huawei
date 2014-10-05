package com.huawei.page01.pro1950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(reverString(scanner.nextLine().trim()));
		scanner.close();
	}

	private static String reverString(String string) {
		String[] strs = string.split(" ");
		String result = "";
		for(String str : strs){
			result = str +" "+ result;
		}
		return result.trim();
	}

}
