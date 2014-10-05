package com.huawei.page03.pro2037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(findNumberOfOne(sc.nextInt()));
		sc.close();
	}

	private static int findNumberOfOne(int num) {
		char[] chs = Integer.toBinaryString(num).toCharArray();
		int result = 0;
		
		for(char ch : chs){
			if(ch == '1'){
				result++;
			}
		}
		return result;
	}

}
