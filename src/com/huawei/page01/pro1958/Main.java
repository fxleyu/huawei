package com.huawei.page01.pro1958;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Long> list = getListNum(scanner.nextLong());
		scanner.close();
		
		printListNum(list);
	}

	private static void printListNum(List<Long> list) {
		String result = "";
		Collections.sort(list);
		for(long temp : list){
			result += " " + temp;
		}
		System.out.println(result.trim());
	}

	private static List<Long> getListNum(long nextLong) {
		List<Long> nums = getPrimeNumber(nextLong);
		List<Long> result = new ArrayList<Long>();
		
		while(nextLong != 1){
			for(long temp : nums){
				if(nextLong%temp == 0){
					nextLong /= temp;
					result.add(temp);
					break;
				}
			}
		}
		
		return result;
	}

	private static List<Long> getPrimeNumber(long nextLong) {
		List<Long> result = new ArrayList<Long>();
		for(long i = 2; i<= nextLong; i++){
			if(isPrimeNum(i)){
				result.add(i);
			}
		}
		return result;
	}

	private static boolean isPrimeNum(long num) {

		for(long i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

}
