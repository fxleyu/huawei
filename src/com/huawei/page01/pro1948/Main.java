package com.huawei.page01.pro1948;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> result = new ArrayList<String>();
		while(sc.hasNext()){
			result = insertResultList(result, sc.next());
		}
		sc.close();
		
		System.out.println(getMaxLength(result));

	}

	private static String getMaxLength(List<String> list) {
		String result = "";
		for(String string : list){
			if(result.length()<string.length()){
				result = string;
			}
		}
		return result;
	}

	private static List<String> insertResultList(List<String> list, String next) {
		List<String> result = new ArrayList<String>();

		for(String string : list){
			result.add(string);
			result.add(superString(string, next));
		}
		result.add(next);
		
		return result;
	}

	private static String superString(String string, String next) {
		for(int i=1; i < string.length(); i++){
			if(next.startsWith(string.substring(i))){
				return string.substring(0, i)+next;
			}
		}
		
		return string;
	}
}
