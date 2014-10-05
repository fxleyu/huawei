package com.huawei.page01.pro1956;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		int sum = scanner.nextInt();
		for(int i=0; i< sum; i++){
			int key = scanner.nextInt();
			int value = scanner.nextInt();
			if(map.containsKey(key)){
				map.put(key, map.get(key)+value);
			}else{
				map.put(key, value);
			}
		}
		scanner.close();
		
		printMap(map);
	}

	private static void printMap(Map<Integer, Integer> map) {
		for(Integer key : map.keySet()){
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}

}
