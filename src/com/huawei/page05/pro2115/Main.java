package com.huawei.page05.pro2115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResultString(sc.nextLine().trim()));
		sc.close();
	}

	private static String getResultString(String line) {
		String[] strs = line.split("[^a-zA-Z]{1,}");
		String result = "";
		for(String str : strs){
			result = str + " " + result;
		}
		return result.trim();
	}

}
