package com.huawei.page06.pro2286;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = Integer.valueOf(sc.nextLine());
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=0; i<total; i++){
			result.add(getTheValue(sc.nextLine()));
		}
		sc.close();
		
		for(int num : result){
			System.out.println(num);
		}
	}

	private static Integer getTheValue(String line) {
		char[] chs = line.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int result = 0;
		
		for(char ch : chs){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		
		List<Integer> nums = new ArrayList<Integer>(map.values());
		Collections.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		for(int i=0; i<nums.size(); i++){
			result += nums.get(i)*(26-i);
		}
		
		return result;
	}

}
