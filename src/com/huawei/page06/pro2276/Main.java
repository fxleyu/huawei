package com.huawei.page06.pro2276;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	private static Set<Character> set = new HashSet<Character>();
	static{
		set.add('A');
		set.add('D');
		set.add('W');
		set.add('S');
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine()));
		sc.close();
	}

	private static String getResult(String nextLine) {
		int[] loc = new int[2];
		String[] control = nextLine.split(";");
		for(String str : control){
			if(isUsable(str)){
				char ch = str.charAt(0);
				int x = Integer.valueOf(str.substring(1));
				run(ch, x, loc);
			}
		}
		return loc[0]+","+loc[1];
	}

	private static void run(char ch, int x, int[] loc) {
		if(ch == 'A'){
			loc[0] -= x;
		}else if(ch == 'D'){
			loc[0] += x;
		}else if(ch == 'W'){
			loc[1] += x;
		}else{
			loc[1] -= x;
		}
	}

	private static boolean isUsable(String str) {
		if(str == null || str.length() < 2){
			return false;
		}
		
		if(set.contains(str.charAt(0))){
			try{
				Integer.valueOf(str.substring(1));
				return true;
			}catch(Exception e){
				return false;
			}
		}
		return false;
	}

}
