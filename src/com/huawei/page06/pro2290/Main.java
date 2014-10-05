package com.huawei.page06.pro2290;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine().trim()));
		sc.close();
	}

	private static int getResult(String line) {
		String[] result = line.split(" ");
		return result[result.length-1].length();
	}
}
