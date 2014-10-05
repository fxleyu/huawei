package com.huawei.page04.pro2082;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(cutString(sc.nextLine(), sc.nextInt()));
		sc.close();
	}

	private static String cutString(String string, int len) {
		String result = "";
		char[] chs = string.toCharArray();
		
		for(char ch : chs){
			if(ch > 127){
				if(len>1){
					result += ch;
					len -= 2;
				} else {
					return result;
				}
			}else{
				if(len > 0){
					result += ch;
					len -= 1;
				} else {
					return result;
				}
			}
		}
		
		return result;
	}

}
