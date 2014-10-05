package com.huawei.page05.pro2270;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResultString(sc.nextLine()));
		sc.close();
	}

	private static String getResultString(String line) {
		StringBuilder result = new StringBuilder();
		char[] chs = line.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : chs){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		
		int min = Collections.min(map.values());
		for(char ch : chs){
			if(min != map.get(ch)){
				result.append(ch);
			}
		}
		
		return result.toString();
	}

}
