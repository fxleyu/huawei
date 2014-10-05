package com.huawei.page03.pro2002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine(), sc.nextLine()));
		sc.close();
	}

	private static boolean getResult(String line, String data) {
		char[] chs = line.toCharArray();
		for(char ch : chs){
			if(data.indexOf(""+ch) == -1){
				return false;
			}
		}
		return true;
	}
}
