package com.huawei.page04.pro2069;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt()));
		sc.close();
	}

	private static String getResult(int nextInt) {
		String result = "";
		for(int i=0; i<nextInt; i++){
			result += "ABCD";
		}
		return result;
	}

}
