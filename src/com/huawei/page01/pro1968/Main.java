package com.huawei.page01.pro1968;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int[] nums = new int[total];
		for(int i=0; i<total; i++){
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println(getMaxSub(nums));
	}

	private static int getMaxSub(int[] nums) {
		int[] len = new int[nums.length];
		len[0] = 1;
		for(int i=1; i<nums.length; i++){
			len[i] = 1;
			for(int j=0; j<i; j++){
				if(nums[j] < nums[i] && len[j]+1 > len[i]){
					len[i] = len[j] + 1;
				}
			}
		}
		return getArrayMax(len);
	}

	private static int getArrayMax(int[] len) {
		int max = 1;
		for(int num : len){
			if(num>max){
				max = num;
			}
		}
		return max;
	}
}
