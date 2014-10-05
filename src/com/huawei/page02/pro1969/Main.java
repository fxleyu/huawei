package com.huawei.page02.pro1969;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(getResultString(sc.nextLine()));
		sc.close();
	}

	private static String getResultString(String line) {
		
		List<Record> list = getRecordList(line);
		Collections.sort(list, new Comparator<Record>(){
			@Override
			public int compare(Record a, Record b) {
				if(a.num != b.num){
					return b.num - a.num;
				}
				
				return a.ch - b.ch;
			}
		});
		
		StringBuilder builder = new StringBuilder();
		for(Record r : list){
			builder.append(r.ch);
		}
		return builder.toString();
	}
	
	private static List<Record> getRecordList(String line) {
		List<Record> result = new ArrayList<Record>();
		char[] chs = line.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		for(char ch : chs){
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}else{
				map.put(ch, 1);
			}
		}
		
		for(char ch : map.keySet()){
			result.add(new Record(ch, map.get(ch)));
		}
		
		return result;
	}

	private static class Record{
		public char ch;
		public int num;
		
		public Record(char ch, int num){
			this.ch = ch;
			this.num = num;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ch;
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Record other = (Record) obj;
			if (ch != other.ch)
				return false;
			return true;
		}
	}
}
