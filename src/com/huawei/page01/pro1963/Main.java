package com.huawei.page01.pro1963;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getMinMult(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	private static int getMinMult(int a, int b) {
		int gcd = gcd(a, b);
		return a * b / gcd;
	}

	private static int gcd(int a, int b) {
		if(a%b == 0){
			return b;
		}
		
		return gcd(b, a%b);
	}

}
