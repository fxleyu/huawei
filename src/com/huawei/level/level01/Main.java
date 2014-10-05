package com.huawei.level.level01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine().trim();
		scanner.close();
		
		int length = getMaxSubstring(string);
		
		System.out.println((string.length()-length)%2);
	}

	private static int getMaxSubstring(String string) {
		
		char[] chs = string.toCharArray();
		int[] length = new int[string.length()];
		
		for(int i=0; i<string.length(); i++){
			length[i] = 1;
			
			for(int j = 0; j<i; j++){
				if(chs[j] < chs[i] && length[j]+1 > length[i]){
					length[i] = length[j]+1;
				}
			}
		}
		
		return getMax(length);
	}

	private static int getMax(int[] length) {
		int result = 1;
		for(int temp : length){
			if(temp>result){
				result = temp;
			}
		}
		return result;
	}
	
}
