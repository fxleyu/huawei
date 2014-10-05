package com.huawei.page01.pro1947;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.println(getOneNum(Integer.toBinaryString(num)));

	}

	private static int getOneNum(String binaryString) {
		int result = 0;
		char[] temp = binaryString.toCharArray();
		for(char ch : temp){
			if(ch == '1'){
				result++;
			}
		}
		return result;
	}

}
