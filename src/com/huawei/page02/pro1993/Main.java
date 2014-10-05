package com.huawei.page02.pro1993;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResultForIP(sc.nextLine()));
		sc.close();
	}

	private static String getResultForIP(String line) {
		if(isIP(line)){
			return "YES";
		}
		return "NO";
	}

	private static boolean isIP(String line) {
		if(line == null || line.length() <8){
			return false;
		}
		String[] nums = line.split("\\.");
		if(nums.length != 4){
			return false;
		}
		
		for(String num : nums){
			try{
				int ip = Integer.valueOf(num);
				if(ip < 0 || ip >255){
					return false;
				}
			}catch(Exception e){
				return false;
			}
		}
		
		return true;
	}
	
}
