package com.huawei.page03.pro2013;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> result = getResult(sc.nextLine().trim());
		sc.close();
		
		System.out.println(result.size());
		for(String string : result){
			System.out.println(string);
		}
	}

	private static List<String> getResult(String line) {
		List<String> result = new ArrayList<String>();
		char[] data = line.toCharArray();
		
		String temp = "";
		boolean flag = false;
		for(char ch : data){
			if(ch == '"'){
				flag = flag ? false : true;
				if(temp.length()>0){
					result.add(temp);
					temp = "";
				}
			} else {
				if(flag){
					temp += ch;
				}else{
					if(ch == ' '){
						if(temp.length()>0){
							result.add(temp);
							temp = "";
						}
					}else{
						temp += ch;
					}
				}
			}
		}
		result.add(temp);
		return result;
	}

}
