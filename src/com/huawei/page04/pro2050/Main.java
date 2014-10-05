package com.huawei.page04.pro2050;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> data = new ArrayList<Integer>();
		for(int i=0; i<total; i++){
			data.add(sc.nextInt());
		}
		
		sc.close();
		
		Collections.sort(data);
		
		for(int i = 0; i<k-1; i++){
			System.out.print(data.get(i)+" ");
		}
		System.out.println(data.get(k-1));
	}

}
