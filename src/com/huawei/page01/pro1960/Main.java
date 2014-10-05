package com.huawei.page01.pro1960;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		getSplitString(scanner.nextLine(), result);
		getSplitString(scanner.nextLine(), result);
		scanner.close();
		
		for(String string : result){
			System.out.println(string);
		}
	}

	private static void getSplitString(String string, List<String> result) {
		string += "0000000";
		for(int i = 8; i<=string.length(); i+=8){
			result.add(string.substring(i-8, i));
		}
	}

}
