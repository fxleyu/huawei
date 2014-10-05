package com.huawei.page05.pro2186;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sortString(sc.nextLine()));
		sc.close();
	}

	private static String sortString(String line) {
		char[] data = line.toCharArray();
		
		sortCharArray(data);
		
		return new String(data);
	}

	private static void sortCharArray(char[] data) {
		for(int i = data.length; i>0; i--){
			for(int j = 0; j<i; j++){
				if(isAlp(data[j])){
					for(int k = j+1; k < i; k++){
						if(isAlp(data[k])){
							if(comparator(data[j], data[k]) > 0){
								char temp = data[j];
								data[j] = data[k];
								data[k] = temp;
							}
							break;
						}
					}
				}
			}
		}
	}

	private static int comparator(char c, char d) {
		c = (c <= 'Z' && c >= 'A') ? (char)(c-'A'+'a'): c;
		d = (d <= 'Z' && d >= 'A') ? (char)(d-'A'+'a'): d;
		return c - d;
	}

	private static boolean isAlp(char c) {
		if(c <= 'Z' && c >= 'A'){
			return true;
		}
		
		if(c <= 'z' && c >= 'a'){
			return true;
		}
		
		return false;
	}
}
