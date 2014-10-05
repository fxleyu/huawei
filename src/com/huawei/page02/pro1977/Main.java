package com.huawei.page02.pro1977;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt()));
		sc.close();
	}

	private static int getResult(int num) {
		int end = 2 + 3 * ( num - 1);
		return (end + 2)*num/2;
	}

}
