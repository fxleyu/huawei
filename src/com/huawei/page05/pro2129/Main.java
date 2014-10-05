package com.huawei.page05.pro2129;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> data = new HashSet<Integer>();
		
		int total = sc.nextInt();
		for(int i=0; i<total; i++){
			data.add(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(doubleNum(new ArrayList<Integer>(data)));
	}
	
	private static int doubleNum(List<Integer> data) {
		int result = 0;
		Set<Integer> set = new HashSet<Integer>(data);
		for(int i=0; i<data.size(); i++){
			for(int j=i+1; j<data.size(); j++){
				if(isPrimeNum(data.get(i)+data.get(j))){
					if(set.contains(data.get(i)) && set.contains(data.get(j))){
						result++;
						set.remove(data.get(i));
						set.remove(data.get(j));
					}
					
				}
			}
		}
		
		return result;
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
