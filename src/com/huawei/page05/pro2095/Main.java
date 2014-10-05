package com.huawei.page05.pro2095;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printResult(sc.nextInt());
		sc.close();
	}

	private static void printResult(int nextInt) {
		double num = (double)nextInt;
		double result = 0;
		
		result = num;
		result += num;
		result += num/2;
		result += num/4;
		result += num/8;
		
		System.out.println(result);
		System.out.println(num/32);
		
	}

}
