package com.huawei.page05.pro2272;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static{
		map.put('a', 2);
		map.put('b', 2);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 3);
		map.put('f', 3);
		map.put('g', 4);
		map.put('h', 4);
		map.put('i', 4);
		map.put('j', 5);
		map.put('k', 5);
		map.put('l', 5);
		map.put('m', 6);
		map.put('o', 6);
		map.put('n', 6);
		map.put('p', 7);
		map.put('q', 7);
		map.put('r', 7);
		map.put('s', 7);
		map.put('t', 8);
		map.put('u', 8);
		map.put('v', 8);
		map.put('w', 9);
		map.put('x', 9);
		map.put('y', 9);
		map.put('z', 9);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine()));
		sc.close();
	}

	private static String getResult(String line) {
		char[] chs = line.toCharArray();
		String result = "";
		
		for(char ch : chs){
			if(ch >= 'a' && ch <= 'z'){
				result += map.get(ch);
			} else if(ch >= 'A' && ch <= 'Z'){
				if(ch == 'Z'){
					result += 'a';
				}else{
					result += (char)('a'+ ch+1 - 'A');
				}
			} else {
				result += ch;
			}
		}
		return result;
	}

}
