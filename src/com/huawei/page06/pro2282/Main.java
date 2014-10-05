package com.huawei.page06.pro2282;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> input = new ArrayList<Integer>();
		int total = sc.nextInt();
		for(int i=0; i<total; i++){
			input.add(sc.nextInt());
		}
		
		sc.close();
		
		List<String> result = getResult(input);
		for(String string : result){
			System.out.println(string);
		}
	}

	private static List<String> getResult(List<Integer> input) {
		List<String> result = new ArrayList<String>();
		
		List<boolean[]> list = orderList(input.size());
		for(boolean[] orders : list){
			result.add(resultString(orders, new LinkedList<Integer>(input)));
		}
		
		return result;
	}

	private static String resultString(boolean[] orders,
			List<Integer> list) {
		Stack<Integer> stack = new Stack<Integer>();
		String result = "";
		
		for(boolean flag : orders){
			if(flag){
				result += stack.pop()+" ";
			}else{
				stack.push(list.get(0));
				list.remove(0);
			}
		}
		return result.trim();
	}

	private static List<boolean[]> orderList(int size) {
		List<boolean[]> result = new ArrayList<boolean[]>();
		boolean[] init = new boolean[2*size];
		result.add(init);
		
		for(int i=0; i< 2*size; i++){
			List<boolean[]> tempResult = new ArrayList<boolean[]>();
			for(boolean[] arr : result){
				boolean[] temp = copyArray(arr);
				temp[i]=true;
				if(isUseable(temp)){
					tempResult.add(temp);
				}
				tempResult.add(arr);
			}
			result = tempResult;
		}
		
		List<boolean[]> tempResult = new ArrayList<boolean[]>();
		for(boolean[] arr : result){
			if(isOrder(arr)){
				tempResult.add(arr);
			}
		}
		
		return tempResult;
	}

	private static boolean isOrder(boolean[] arr) {
		int num = 0;
		for(boolean te : arr){
			if(te){
				num++;
			}
		}
		if(num != arr.length/2){
			return false;
		}
		
		int[] test = new int[arr.length];
		if(arr[0]){
			return false;
		}
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]){
				test[i] = test[i-1]+1;
				if(2*test[i]>i+1){
					return false;
				}
			}else{
				test[i] = test[i-1];
			}
		}
		return true;
	}

	private static boolean isUseable(boolean[] temp) {
		int sum = 0;
		for(boolean t : temp){
			if(t){
				sum++;
			}
		}
		return (sum > temp.length/2) ? false : true;
	}

	private static boolean[] copyArray(boolean[] arr) {
		boolean[] result = new boolean[arr.length];
		for(int i = 0; i< arr.length; i++){
			result[i] = arr[i];
		}
		return result;
	}
}
