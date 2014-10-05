package com.huawei.page01.pro1955;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getNewInterger(scanner.nextInt()));
		scanner.close();
	}

	private static int getNewInterger(int nextInt) {
		char[] num = Integer.valueOf(nextInt).toString().toCharArray();
		String result = "";
		for(int i = num.length-1; i>=0; i--){
			if(result.indexOf(""+num[i]) == -1 ){
				result += num[i];
			}
		}
		return Integer.valueOf(result);
	}

}
