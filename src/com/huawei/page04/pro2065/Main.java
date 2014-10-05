package com.huawei.page04.pro2065;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<Integer>();
		
		int total = sc.nextInt();
		for(int i=0; i<total; i++){
			list.add(sc.nextInt());
		}
		int k = sc.nextInt();
		
		sc.close();
		
		System.out.println(list.get(total-k-1));
	}

}
