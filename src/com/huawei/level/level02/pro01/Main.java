package com.huawei.level.level02.pro01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(VerifyGoldbachGuess(scanner.nextInt()));
		scanner.close();

	}
	
	private static int VerifyGoldbachGuess(int num) {
		if(num % 2 != 0){
			return 1;
		}
		
		Set<Integer> primeNums = getPrimeNumber(num);
		for(int i = 1; i<num; i++){
			if(primeNums.contains(i)){
				if(primeNums.contains(num-i)){
					return 1;
				}
			}
		}
		return 0;
	}

	private static Set<Integer> getPrimeNumber(int num) {
		Set<Integer> result = new HashSet<Integer>();
		result.add(1);
		for(int i = 2; i<= num; i++){
			if(isPrimeNum(i)){
				result.add(i);
			}
		}
		return result;
	}
	
	private static boolean isPrimeNum(int num) {
		
		for(long i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}

}
