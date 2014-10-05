package com.huawei.page05.pro2273;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		
		while(sc.hasNext()){
			result.add(getResult(sc.next()));
		}
		sc.close();
		
		for(String str : result){
			System.out.println(str);
		}
	}

	private static String getResult(String next) {
		char[] chs = next.toCharArray();
		
		if(chs.length > 8){
			if(isAlp(chs) + isALP(chs) + isNum(chs) + isOther(chs) >= 3){
				if(!hasSub(next)){
					return "OK";
				}
			}
		}
		
		return "NG";
	}

	private static boolean hasSub(String line) {
		for(int i=0; i<line.length()-6; i++){
			String sub = line.substring(i, i+3);
			for(int j = i+3; j<line.length()-3; j++){
				if(sub.equals(line.substring(j, j+3))){
					return true;
				}
			}
		}
		return false;
	}

	private static int isOther(char[] chs) {
		for(char ch : chs){
			if(!(ch <= 'z' && ch >= 'a')&&!(ch <= '9' && ch >= '0') && !(ch <= 'Z' && ch >= 'A')){
				return 1;
			}
		}
		return 0;
	}

	private static int isNum(char[] chs) {
		for(char ch : chs){
			if(ch <= '9' && ch >= '0'){
				return 1;
			}
		}
		return 0;
	}

	private static int isALP(char[] chs) {
		for(char ch : chs){
			if(ch <= 'Z' && ch >= 'A'){
				return 1;
			}
		}
		return 0;
	}

	private static int isAlp(char[] chs) {
		for(char ch : chs){
			if(ch <= 'z' && ch >= 'a'){
				return 1;
			}
		}
		return 0;
	}

}
