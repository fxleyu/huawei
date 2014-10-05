package com.huawei.page03.pro2043;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int result = getMinPrime(num);
		System.out.println(result);
		System.out.println(num -result);
	}
	
	private static int getMinPrime(int num) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<num; i++){
			if(isPrimeNum(i)){
				set.add(i);
			}
		}
		
		for(int i = num/2; i>0; i--){
			if(set.contains(i) && set.contains(num - i)){
				return i;
			}
		}
		
		return 0;
	}

	private static boolean isPrimeNum(int num) {
		if(num < 2){
			return false;
		}
		
		for(long i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
}
