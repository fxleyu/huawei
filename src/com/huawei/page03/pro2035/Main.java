package com.huawei.page03.pro2035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printResult(sc.nextInt(), sc.nextLine());
		sc.close();
	}

	private static void printResult(int num, String control) {
		int loc = getLoc(control);
		loc = (loc%num + num)% num;
		if(num <= 4){
			System.out.println(getFistTable(num));
		} else {
			System.out.println(getTable(num, loc, control));
		}
		System.out.println(loc);
	}

	private static String getTable(int num, int loc, String control) {
		boolean flag = getFlag(control, num);
		if(flag){
			if(loc<4){
				return getFistTable(num);
			} else if(loc > 4 && loc + 3 < num){
				return getTable(loc);
			} else{
				return getEndTable(num);
			}
			
		}else{
			if(loc+3 >= num){
				return getEndTable(num);
			}else{
				return getTable(loc);
			}
		}
	}

	private static boolean getFlag(String control, int num) {
		char[] chs = control.toCharArray();
		boolean flag = true;
		int result = 0;
		for(char ch : chs){
			if(ch == 'U'){
				if(result % num == 0){
					flag = false;
				}
				result--;
			}else{
				if(Math.abs(result % num) == (num-1)){
					flag = true;
				}
				result++;
			}
		}
		return flag;
	}

	private static int getLoc(String control) {
		char[] chs = control.toCharArray();
		int result = 0;
		for(char ch : chs){
			if(ch == 'U'){
				result--;
			}else{
				result++;
			}
		}
		return result;
	}

	private static String getFistTable(int num) {
		String result = "";
		for(int i =1; i<= num && i<=4; i++){
			result += " "+i;
		}
		return result.trim();
	}
	
	private static String getTable(int x){
		String result = "";
		for(int i =x ; i< x+4; i++){
			result += " "+i;
		}
		return result.trim();
	}
	
	private static String getEndTable(int num) {
		String result = "";
		for(int i =num-4+1 ; i<= num; i++){
			result += " "+i;
		}
		return result.trim();
	}

}
