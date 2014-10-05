package com.huawei.page01.pro1962;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] chars = scanner.nextLine().toLowerCase().toCharArray();
		char ch = scanner.nextLine().charAt(0);
		
		scanner.close();
		
		if(ch>='A' && ch <='Z'){
			ch = (char) ('a' + ch - 'A');
		}
		
		int result = 0;
		for(char temp : chars){
			if(temp == ch){
				result++;
			}
		}
		System.out.println(result);
	}
}
