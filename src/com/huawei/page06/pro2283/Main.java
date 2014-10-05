package com.huawei.page06.pro2283;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static String UNK = "xxx";
	static String ONE = "reset";
	static List<String> LIST = new ArrayList<String>();
	static Map<String, String> MAP = new HashMap<String, String>();
	static{
		LIST.add("reset board");
		LIST.add("board add");
		LIST.add("board delet");
		LIST.add("reboot backplane");
		LIST.add("backplane abort");
		
		MAP.put("reset", "reset what");
		MAP.put("reset board", "board fault");
		MAP.put("board add", "where to add");
		MAP.put("board delet", "no board at all");
		MAP.put("reboot backplane", "impossible");
		MAP.put("backplane abort", "install first");
		MAP.put("xxx", "unkown command");
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> input = new ArrayList<String>();
		while(sc.hasNext()){
			input.add(sc.nextLine());
		}
		
		sc.close();
		
		List<String> result = getResult(input);
		for(String re : result){
			System.out.println(re);
		}
	}

	private static List<String> getResult(List<String> input) {
		List<String> result = new ArrayList<String>();
		
		for(String string : input){
			String key = getKeyString(string);
			result.add(MAP.get(key));
		}
		
		return result;
	}

	private static String getKeyString(String string) {
		String[] strs = string.split(" ");
		if(strs.length == 1){
			if(ONE.startsWith(strs[0])){
				return ONE;
			} else {
				return UNK;
			}
		} else if(strs.length == 2){
			List<String> list= new ArrayList<String>();
			for(String order : LIST){
				String[] ord = order.split(" ");
				if(ord[0].startsWith(strs[0]) && ord[1].startsWith(strs[1])){
					list.add(order);
				}
			}
			if(list.size() == 1){
				return list.get(0);
			}
		}
		return UNK;
	}

}
