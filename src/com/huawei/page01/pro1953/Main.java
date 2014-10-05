package com.huawei.page01.pro1953;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSum(scanner.nextLine()));
		scanner.close();
	}

	private static int getSum(String nextLine) {
		Set<Character> set = new HashSet<Character>();
		for(char ch : nextLine.toCharArray()){
			if(ch < 128){
				set.add(ch);
			}
		}
		return set.size();
	}

}
