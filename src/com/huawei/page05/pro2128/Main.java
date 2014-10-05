package com.huawei.page05.pro2128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		
		System.out.println(encryption(a));
		System.out.println(decryption(b));
	}

	private static String decryption(String str) {
		String result = "";
		char[] data = str.toCharArray();
		
		for(char da : data){
			if(da>='A' &&da<='Z'){
				result += (char)((da-'A'+26-1)%26 + 'a'); 
			} else if(da>='a' &&da<='z'){
				result += (char)((da-'a'+26-1)%26 + 'A'); 
			} else if(da>='0' && da<='9'){
				result += (Integer.valueOf(""+da)+10-1)%10;
			}else{
				result += da;
			}
		}
		
		return result;
	}

	private static String encryption(String str) {
		String result = "";
		char[] data = str.toCharArray();
		
		for(char da : data){
			if(da>='A' &&da<='Z'){
				result += (char)((da-'A'+1)%26 + 'a'); 
			} else if(da>='a' &&da<='z'){
				result += (char)((da-'a'+1)%26 + 'A'); 
			} else if(da>='0' && da<='9'){
				result += (Integer.valueOf(""+da)+1)%10;
			}else{
				result += da;
			}
		}
		
		return result;
	}
}
