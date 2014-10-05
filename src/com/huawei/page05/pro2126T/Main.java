package com.huawei.page05.pro2126T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map<Character, Character> map = new HashMap<Character, Character>();
	static{
		map.put('0', '0');
		map.put('1', '8');
		map.put('2', '4');
		map.put('3', 'C');
		map.put('4', '2');
		map.put('5', 'A');
		map.put('6', '6');
		map.put('7', 'E');
		map.put('8', '1');
		map.put('9', '9');
		map.put('a', '5');
		map.put('b', 'D');
		map.put('c', '3');
		map.put('d', 'B');
		map.put('e', '7');
		map.put('f', 'F');
		map.put('A', '5');
		map.put('B', 'D');
		map.put('C', '3');
		map.put('D', 'B');
		map.put('E', '7');
		map.put('F', 'F');
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = sc.next();
		result += sc.next();
		
		sc.close();
		
		System.out.println(getResult(result));
	}

	private static String getResult(String str) {
		char[] input = str.toCharArray();
		
		sort(input);
		
		String result = "";
		for(char ch : input){
			if(map.keySet().contains(ch)){
				result += map.get(ch);
			}else{
				result += ch;
			}
			
		}
		return result;
	}

	private static void sort(char[] input) {
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for(int i=0; i<input.length; i += 2){
			list1.add(input[i]);
			if(i+1 < input.length){
				list2.add(input[i+1]);
			}
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		for(int i=0; i<input.length; i++){
			if(i%2 == 0){
				input[i] = list1.get(i/2);
			}else{
				input[i] = list2.get((i-1)/2);
			}
		}
	}
}
