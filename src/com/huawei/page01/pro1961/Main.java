package com.huawei.page01.pro1961;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> set = new TreeSet<Integer>();
		
		int total = scanner.nextInt();
		for(int i=0; i<total; i++){
			set.add(scanner.nextInt());
		}
		scanner.close();
		
		for(int num : set){
			System.out.println(num);
		}
	}
}
