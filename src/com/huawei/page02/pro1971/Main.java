package com.huawei.page02.pro1971;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		
		int total = sc.nextInt();
		for(int i=0; i<total; i++){
			result.add(sc.nextInt());
		}
		
		
		Collections.sort(result);
		if(sc.nextInt()!=0){
			Collections.reverse(result);
		}
		
		sc.close();
		
		String out = "";
		for(int x : result){
			out += " "+x;
		}
		System.out.println(out.trim());
	}
}
