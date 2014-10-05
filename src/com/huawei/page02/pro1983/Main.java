package com.huawei.page02.pro1983;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = getResultArray(sc.nextInt(), sc.nextInt());
		sc.close();
		
		for(int x:result){
			System.out.println(x);
		}
	}

	private static List<Integer> getResultArray(int a, int b) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = a; i<=b; i++){
			if(isPrimeNum(i)){
				list.add(i);
			}
		}
		
		List<List<Integer>> collection = getAllList(list);
		
		List<Integer> result = new ArrayList<Integer>();
		int max = 0;
		
		for(List<Integer> col : collection){
			if(col.size() >= max){
				if(max == col.size() ){
					result = getBig(col, result);
				}else{
					max = col.size();
					result = col;
				}
				
			}
		}
		
		return result;
	}
	
	private static List<Integer> getBig(List<Integer> A,
			List<Integer> B) {
		for(int i=A.size()-1; i>=0; i--){
			if(A.get(i) != B.get(i)){
				return A.get(i) < B.get(i) ? B : A;
			}
		}
		return A;
	}

	private static List<List<Integer>> getAllList(List<Integer> list) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Set<Integer> set = new HashSet<Integer>(list);
		
		for(int i=0; i<list.size(); i++){
			for(int j = i+1; j< list.size(); j++){
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(list.get(i));
				temp.add(list.get(j));
				int sub = list.get(j)-list.get(i);
				int addNum = list.get(j);
				while(true){
					addNum += sub;
					if(set.contains(addNum)){
						temp.add(addNum);
					} else{
						break;
					}
				}
				result.add(temp);
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