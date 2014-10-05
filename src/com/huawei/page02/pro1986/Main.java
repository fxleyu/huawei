package com.huawei.page02.pro1986;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String,Integer>();
		List<String> result = new ArrayList<String>();
		
		int total = sc.nextInt();
		for(int i=0; i< total; i++){
			String temp = sc.next();
			result.add(temp);
			map.put(temp, 0);
		}
		
		total = sc.nextInt();
		for(int i=0; i<total; i++){
			String temp = sc.next();
			if(map.containsKey(temp)){
				map.put(temp, map.get(temp)+1);
			}
		}

		sc.close();
		
		int sum = 0;
		for(String str : result){
			int num = map.get(str);
			if(num != 0){
				System.out.println(str+" : "+num);
				sum += map.get(str);
			}
		}
		System.out.println("Invalid : "+(total - sum));
	}

}
