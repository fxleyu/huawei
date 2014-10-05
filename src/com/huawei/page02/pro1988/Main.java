package com.huawei.page02.pro1988;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>();
		
		int total = sc.nextInt();
		for(int i=0; i< total; i++){
			nums.add(sc.nextInt());
		}
		
		sc.close();
		
		System.out.println(getResult(nums));
	}

	private static boolean getResult(List<Integer> nums) {
		List<Integer> three = new ArrayList<Integer>();
		List<Integer> five = new ArrayList<Integer>();
		List<Integer> other = new ArrayList<Integer>();
		
		for(int num : nums){
			if(num%5 == 0){
				five.add(num);
			} else if(num%3 ==0){
				three.add(num);
			} else {
				other.add(num);
			}
		}
		
		int fi = sumTheList(five);
		int th = sumTheList(three);
		int oh = sumTheList(other);
		
		int sum = fi+th+oh;
		if(sum%2 != 0){
			return false;
		} 
	
		int a = sum /2 -fi;
		return hasSubList(other, a);
	}

	private static boolean hasSubList(List<Integer> other, int a) {		
		for(int oth : other){
			if(oth == a){
				return true;
			}
		}
		
		for(int i=0; i<other.size(); i++){
			List<Integer> temp =  new ArrayList<Integer>(other);
			temp.remove(i);
			if(hasSubList(temp, a - other.get(i))){
				return true;
			}
		}
		
		return false;
	}

	private static int sumTheList(List<Integer> nums) {
		int result = 0;
		for(int num : nums){
			result += num;
		}
		return result;
	}

}
