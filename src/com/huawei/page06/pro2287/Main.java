package com.huawei.page06.pro2287;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sortString(sc.nextLine()));
		sc.close();
	}
	private static String sortString(String line) {
		char[] chs = line.toCharArray();
		Arrays.sort(chs);
		return new String(chs);
	}
}
