package com.huawei.page05.pro2100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static List<Character> list = new ArrayList<Character>();
	static{
		for(int i=0; i<26; i++){
			list.add((char)('A'+i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine(), sc.nextLine()));
		sc.close();
	}

	private static String getResult(String sec, String str) {
		char[] arr = sec.toUpperCase().toCharArray();
		
		List<Character> tempList = new ArrayList<Character>();
		for(char ch : arr){
			if(list.contains(ch)){
				tempList.add(ch);
				list.remove(Character.valueOf(ch));
			}
		}
		tempList.addAll(list);
		
		String result = "";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				result += (char)tempList.get(str.charAt(i)-'A');
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				result += (char)(tempList.get(str.charAt(i)-'a')-'A'+'a');
			}else{
				result += (char)str.charAt(i);
			}
		}
		
		return result;
	}

}
