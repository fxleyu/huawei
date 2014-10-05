package com.huawei.page05.pro2196;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> num = new ArrayList<String>();
		List<Integer> rules = new ArrayList<Integer>();
		
		int total = sc.nextInt();
		for(int i=0; i<total; i++){
			num.add(""+sc.nextInt());
		}
		
		total = sc.nextInt();
		for(int i=0; i<total; i++){
			rules.add(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(getResult(num, rules));
	}

	private static String getResult(List<String> num, List<Integer> rules) {
		Set<Integer> set = new HashSet<Integer>(rules);
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		List<Integer> result = new ArrayList<Integer>();
		
		for(int now  : list){
			Record record = new Record();
			for(int i=0; i<num.size(); i++){
				if(num.get(i).indexOf(now+"") != -1){
					record.num++;
					record.list.add(i);
					record.list.add(Integer.valueOf(num.get(i)));
				}
			}
			if(record.num != 0){
				result.add(now);
				result.add(record.num);
				result.addAll(record.list);
			}
		}
		
		String string = "";
		string += result.size();
		for(int t : result){
			string += " "+t;
		}
		
		return string.trim();
	}
	
	static class Record{
		int num;
		List<Integer> list = new ArrayList<Integer>();
	}
}
