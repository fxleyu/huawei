package com.huawei.page04.pro2048;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine()));
		sc.close();
	}

	private static char getResult(String line) {
		char[] chs = line.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(char ch : chs ){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		
		for(char ch : map.keySet()){
			if(map.get(ch)==1){
				return ch;
			}
		}
		
		return '.';
	}

}
