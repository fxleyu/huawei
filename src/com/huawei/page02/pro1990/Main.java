package com.huawei.page02.pro1990;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine()));
		sc.close();
	}

	private static String getResult(String nextLine) {
		if(nextLine == null || nextLine.length()<1){
			return nextLine;
		}
		char[] data = nextLine.toCharArray();
		int[] num = new int[data.length+1];
		
		for(int i =1; i < num.length; i++){
			if(data[i-1] >='0' && data[i-1] <= '9'){
				num[i] = num[i-1]+1; 
			}
		}
		
		int index = -1;
		for(int i=1, max = 0; i< num.length; i++){
			if(num[i] > max){
				index = i;
			}
		}
		
		if(index == -1){
			return ""+0;
		}
		
		String result = nextLine.substring(index - num[index], index);
		return result+","+result.length();
	}
}
