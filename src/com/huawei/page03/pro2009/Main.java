package com.huawei.page03.pro2009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt()));
		sc.close();
	}

	private static String getResult(int num) {
		String result = "";
		
		int add = getTheAddNum(num);
		for(int i=1; i<num; i++){
			result += add+"+";
			add += 2;
		}
		result += add;
		
		return result;
	}

	private static int getTheAddNum(int num) {
		return num*(num-1) + 1;
	}

}
