package com.huawei.page05.pro2114N;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine()));
		sc.close();
	}

	private static int getResult(String str) {
		int max = -1;
		char[] data = str.toCharArray();
		
		for(int i=0; i<data.length; i++){
			int tempLen = getLen(data, i);
			if(tempLen  > max){
				max = tempLen;
			}
		}
		
		return max;
	}

	private static int getLen(char[] data, int i) {
		for(int j = data.length-1; j>i; j--){
			if(isUseble(data, i, j)){
				return j-i+1;
			}
		}
		return 1;
	}

	private static boolean isUseble(char[] data, int i, int j) {
		while(i<j){
			if(data[i] == data[j]){
				i++;
				j--;
			}else{
				return false;
			}
		}
		return true;
	}

}
