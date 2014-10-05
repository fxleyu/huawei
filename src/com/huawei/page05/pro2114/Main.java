package com.huawei.page05.pro2114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		List<String> result = new ArrayList<String>();
		for(int i=0; i<total; i++){
			result.add(sc.next());
		}
		String word = sc.next();
		int num = sc.nextInt();
		
		sc.close();
		
		List<String> list = getResult(result, word);
		System.out.println(list.size());
		System.out.println(list.get(num-1));
		
	}

	private static List<String> getResult(List<String> input, String word) {
		List<String> result = new ArrayList<String>();
		
		for(String string : input){
			if(isBrotherWord(string, word)){
				result.add(string);
			}
		}
		
		Collections.sort(result);
		return result;
	}

	private static boolean isBrotherWord(String string, String word) {
		if(string.equals(word)){
			return false;
		}
		
		char[] strs = string.toCharArray();
		char[] wors = word.toCharArray();
		if(strs.length == wors.length){
			Arrays.sort(wors);
			Arrays.sort(strs);
			for(int i=0; i<wors.length; i++){
				if(strs[i] != wors[i]){
					return false;
				}
			}
			return true;
		}
		
		return false;
	}
}
