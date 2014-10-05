package com.huawei.page05.pro2274;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		while(sc.hasNext()){
			list.add(sc.nextLine());
		}
		
		sc.close();
		
		List<String> result = getResult(list);
		for(String str : result){
			System.out.println(str);
		}
	}

	private static List<String> getResult(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

}
