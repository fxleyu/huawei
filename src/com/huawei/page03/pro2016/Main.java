package com.huawei.page03.pro2016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		sc.close();
	}

	private static int getResult(int year, int month, int day) {
		if(month<1 || month > 12){
			return -1;
		}
		
		int[] days = getMonths(year);
		if(day > days[month]){
			return -1;
		}
		
		int result = 0;
		for(int i=1; i<month; i++){
			result += days[i];
		}
		return result+day;
	}

	private static int[] getMonths(int year) {
		int[] days = new int[13];
		for(int i=0;i<13; i++){
			days[i] = 30;
		}
		
		if(isYunYear(year)){
			days[2] = 29;
		}else{
			days[2] = 29;
		}
		
		days[1]++;
		days[3]++;
		days[5]++;
		days[7]++;
		days[8]++;
		days[10]++;
		days[12]++;
		
		return days;
	}

	private static boolean isYunYear(int year) {
		return (year%100 != 0 && year % 4 == 0) || year % 400 == 0;
	}

}
