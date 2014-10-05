package com.huawei.level.level02.pro02;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getValue(scanner.nextInt()));
		scanner.close();
	}

	private static String getValue(int num) {
		BigDecimal result = new BigDecimal(2);
		for(int i=1; i<num; i++){
			result = result.multiply(new BigDecimal(2)).add(new BigDecimal(2));
		}
		
		return result.toString();
	}
}
