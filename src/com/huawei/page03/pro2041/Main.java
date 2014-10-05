package com.huawei.page03.pro2041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 使用分割法
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt(), sc.nextInt()));
		sc.close();
	}

	private static int getResult(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		return getNums(max, min);
	}

	private static int getNums(int max, int min) {
		Set<String> result = new HashSet<String>();
		List<List<Integer>> nums = new ArrayList<List<Integer>>();
		
		result.add(max+"");
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(max);
		nums.add(temp);
		for(int i=2; i<= min; i++){
			List<List<Integer>> tempNums = new ArrayList<List<Integer>>();
			for(List<Integer> tempList : nums){
				for(int j=0; j<tempList.size(); j++){
					List<Integer> tempInsert = removeList(tempList,j);
					addResult(result, tempInsert, tempList.get(j), tempNums);
				}
			}
			nums = tempNums;
		}
		
		return result.size();
	}
	
	private static void addResult(Set<String> result,
			List<Integer> tempInsert, int integer, List<List<Integer>> nums) {
		if(integer == 1){
			return;
		}
		
		for(int i=1; i<= integer/2; i++){
			List<Integer> temp = copyList(tempInsert);
			temp.add(i);
			temp.add(integer-i);
			String str = getStr(temp);
			if(!result.contains(str)){
				result.add(str);
				nums.add(temp);
			}
			
		}
	}
	
	private static String getStr(List<Integer> temp) {
		Collections.sort(temp);
		String result = "";
		
		for(int t : temp){
			result += " "+t;
		}
		
		return result.trim();
	}

	private static List<Integer> copyList(List<Integer> nums) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i< nums.size(); i++){
			result.add(nums.get(i));
		}
		return result;
	}

	private static List<Integer> removeList(List<Integer> nums, int k) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i< nums.size(); i++){
			if(i != k){
				result.add(nums.get(i));
			}
		}
		return result;
	}

}
