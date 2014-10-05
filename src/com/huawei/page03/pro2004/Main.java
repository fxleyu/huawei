package com.huawei.page03.pro2004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		int total = sc.nextInt();
		for(int i = 0; i<total; i++){
			set.add(sc.nextInt());
		}
		total = sc.nextInt();
		for(int i = 0; i<total; i++){
			set.add(sc.nextInt());
		}
		
		sc.close();
		
		List<Integer> result = new ArrayList<Integer>(set);
		Collections.sort(result);
		for(int re : result){
			System.out.print(re);
		}
	}
}
