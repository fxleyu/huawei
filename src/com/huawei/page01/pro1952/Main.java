package com.huawei.page01.pro1952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getReserNum(scanner.nextInt()));
		scanner.close();
	}

	private static String getReserNum(int nextInt) {
		char[] result = Integer.valueOf(nextInt).toString().toCharArray();
		reverCharArray(result);
		return new String(result);
	}
	
	private static void reverCharArray(char[] result) {
		int i = 0;
		int j = result.length-1;
		while(i<j){
			char temp = result[i];
			result[i] = result[j];
			result[j] = temp;
			i++;
			j--;
		}
	}

}
