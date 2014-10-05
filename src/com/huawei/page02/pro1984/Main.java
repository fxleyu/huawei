package com.huawei.page02.pro1984;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(changeString(sc.nextLine()));
		sc.close();
	}

	private static String changeString(String line) {
		StringBuilder builder = new StringBuilder();
		char[] chs = line.toCharArray();
		
		boolean hasNum = false;
		for(char ch : chs){
			if(hasNum){
				if(ch<'0' || ch>'9'){
					builder.append("*");
					hasNum = false;
				}
			}else{
				if(ch>='0' && ch<='9'){
					builder.append("*");
					hasNum = true;
				}
			}
			builder.append(ch);
		}
		
		if(hasNum){
			builder.append("*");
		}
		
		return builder.toString();
	}
}
