package com.huawei.page05.pro2097;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[sc.nextInt()];
		sc.close();
		
		if(nums.length < 3){
			System.out.println(1);
		}else{
			nums[0] = 1;
			nums[1] = 1;
			for(int i=2; i<nums.length; i++){
				nums[i] = nums[i-1]+nums[i-2];
			}
			System.out.println(nums[nums.length-1]);
		}
	}
}
