package com.huawei.page01.pro1959;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(Integer.valueOf(scanner.nextLine().trim().substring(2), 16));
		scanner.close();
	}

}
