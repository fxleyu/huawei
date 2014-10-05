package com.huawei.page05.pro2113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ip = sc.nextInt();
		sc.close();
		
		System.out.println(getResult(str));
		System.out.println(getResult(ip));
	}

	private static String getResult(int ip) {
		String str = Long.toBinaryString(ip);
		
		if(str.length()<32){
			for(int i=str.length(); i<32; i++){
				str = "0"+str;
			}
		}
		return Integer.valueOf(str.substring(0, 8), 2)
				+"."+Integer.valueOf(str.substring(8, 16), 2)
				+"."+Integer.valueOf(str.substring(16, 24), 2)
				+"."+Integer.valueOf(str.substring(24, 32), 2);
	}

	private static long getResult(String str) {
		String[] arr = str.split("\\.");
		String result = "";
		for(String a: arr){
			String st = Integer.toString(Integer.valueOf(a), 2);
			for(int i =st.length(); i<8; i++){
				st = "0"+st;
			}
			result += st;
		}
		return Long.valueOf(result, 2);
	}

}
