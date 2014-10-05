package com.huawei.page02.pro1996;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextByte()));
		sc.close();
	}

	private static int getResult(byte b) {
		String str = Integer.toBinaryString(b);
		if(b < 0){
			str = str.substring(24);
		}
		int[] max = new int[str.length()+1];
		for(int i=1; i<= str.length(); i++){
			if(str.charAt(i-1)=='1'){
				max[i] = max[i-1]+1;
			}
		}
		return maxValue(max);
	}

	private static int maxValue(int[] nums) {
		int max = 0;
		for(int num : nums){
			if(num > max){
				max = num;
			}
		}
		return max;
	}

}
