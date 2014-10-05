package com.huawei.page02.pro1998;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(UpperCharNum(sc.nextLine()));
		sc.close();
	}

	private static int UpperCharNum(String line) {
		int result = 0;
		char[] chs = line.toCharArray();
		for(char ch : chs){
			if(ch>='A' && ch <= 'Z'){
				result++;
			}
		}
		return result;
	}

}
