package com.huawei.page02.pro2001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine()));
		sc.close();
	}

	private static String getResult(String line) {
		String[] nums = line.split("/");
		int a = Integer.valueOf(nums[0]);
		int b = Integer.valueOf(nums[1]);
		return getResultString(a, b);
	}

	private static String getResultString(int a, int b) {
		String result = "";
		int c = 0;
		while(true){
			c=b/a+1;
			if(a%b == 0){
				a = 1;
				return result+"1/"+c;
			}
			result += "1/"+c+"+";
			
			a=a*c-b;
	        b=b*c;
	        if(a==3){  
	            return result+"1/"+(b/2)+"+1/"+b;  
	        }  
		}
	}
}
