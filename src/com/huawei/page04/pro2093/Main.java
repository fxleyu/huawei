package com.huawei.page04.pro2093;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		int[] result = getResult(input);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
	}

	private static int[] getResult(String input) {
		int[] result = new int[4];
		char[] data = input.toCharArray();
		for(char ch : data){
			if(ch>='0' && ch <= '9'){
				result[2]++;
			}else if(ch == ' '){
				result[1]++;
			}else if((ch>='a' && ch <= 'z')||(ch>='A' && ch <= 'Z')){
				result[0]++;
			}else{
				result[3]++;
			}
		}
		return result;
	}

}
