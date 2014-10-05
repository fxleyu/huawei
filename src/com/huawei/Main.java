package com.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			list.add(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(getResult(list));
	}

	private static String getResult(List<Integer> list) {
		Collections.sort(list);
		
		int[] result = new int[22];
		int a = 0;
		int b = 1;
		for(int i=0; i<list.size(); i++){
			if(list.get(i)%2 != 0){
				result[a] = list.get(i);
				a += 2;
			}else{
				result[b] = list.get(i);
				b += 2;
			}
		}
		
		int i=0;
		List<Integer> temp = new ArrayList<Integer>();
		while(i<20){
			if(result[i] == 0 && result[i+1]==0){
				break;
			}
			temp.add(result[i++]);
		}
		
		return getStr(temp);
	}

	private static String getStr(List<Integer> temp) {
		String result = "";
		for(int x : temp){
			result += " "+ x;
		}
		return result.trim();
	}
}
