package com.huawei.page02.pro1995;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine()));
		sc.close();
	}

	private static String getResult(String nextLine) {
		int score = getScore(nextLine.toCharArray());
		return stringResult(score);
	}

	private static String stringResult(int score) {
		if(score>= 90){
			return "VERY_SECURE";
		} else if(score >= 80){
			return "SECURE";
		} else if(score >= 70){
			return "VERY_STRONG";
		} else if(score >= 60){
			return "STRONG";
		} else if(score >= 50){
			return "AVERAGE";
		} else if(score >= 25){
			return "WEAK";
		}
		return "VERY_WEAK";
	}

	private static int getScore(char[] charArray) {
		int result = 0;
		
		result += lenScore(charArray);
		result += alpScore(charArray);
		result += numScore(charArray);
		result += signScore(charArray);
		result += cheerScore(charArray);
		
		return result;
	}

	private static int cheerScore(char[] charArray) {
		int num = getNums(charArray);
		int a = getAlp(charArray);
		int A = getALP(charArray);
		int sign = signNum(charArray);
		
		if(num != 0 && a != 0 && A != 0 && sign != 0){
			return 5;
		}
		
		if(num != 0 && (a != 0 || A != 0) && sign != 0){
			return 3;
		}
		
		if(num != 0 && (a != 0 || A != 0) && sign == 0){
			return 2;
		}
		
		return 0;
	}

	private static int signScore(char[] charArray) {
		int result = signNum(charArray);
		
		if(result == 0){
			return 0;
		}
		if(result == 1){
			return 10;
		}
		return 25;
	}

	private static int signNum(char[] charArray) {
		int result = 0;
		for(char ch : charArray){
			if(isSign(ch)){
				result++;
			}
		}
		return result;
	}

	private static boolean isSign(char ch) {
		if(ch>='!' && ch<='/'){
			return true;
		}
		
		if(ch>=':' && ch<='@'){
			return true;
		}
		
		if(ch>='[' && ch<='`'){
			return true;
		}
		
		if(ch>='{' && ch<='~'){
			return true;
		}
		
		return false;
	}

	private static int numScore(char[] charArray) {
		int result = getNums(charArray);
		
		if(result == 0){
			return 0;
		}
		if(result == 1){
			return 10;
		}
		return 20;
	}

	private static int getNums(char[] charArray) {
		int result = 0;
		for(char ch : charArray){
			if(isNum(ch)){
				result++;
			}
		}
		return result;
	}

	private static boolean isNum(char ch) {
		if(ch >='0'&&ch<='9'){
			return true;
		}
		return false;
	}

	private static int alpScore(char[] charArray) {
		int a = getAlp(charArray);
		int b = getALP(charArray);
		if(a+b == 0){
			return 0;
		}
		
		if(a ==0 || b==0){
			return 10;
		}
		
		return 20;
	}

	private static int getALP(char[] charArray) {
		int result = 0;
		for(char ch : charArray){
			if(ch>='A' && ch<='Z'){
				result++;
			}
		}
		return result;
	}

	private static int getAlp(char[] charArray) {
		int result = 0;
		for(char ch : charArray){
			if(ch>='a' && ch<='z'){
				result++;
			}
		}
		return result;
	}

	private static int lenScore(char[] charArray) {
		if(charArray.length <= 4){
			return 5;
		}else if(charArray.length <= 7){
			return 10;
		}else{
			return 25;
		}
	}

}
