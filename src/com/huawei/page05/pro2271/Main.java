package com.huawei.page05.pro2271;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> input = new ArrayList<Integer>();
		
		while(true){
			int temp = sc.nextInt();
			if(temp != 0){
				input.add(temp);
			}else{
				break;
			}
		}
		
		sc.close();
		
		List<Integer> result = getResult(input);
		for(int re : result){
			System.out.println(re);
		}
	}

	private static List<Integer> getResult(List<Integer> input) {
		List<Integer> result = new ArrayList<Integer>();
		for(int in : input){
			result.add(getMax(in, 0));
		}
		return result;
	}

	private static Integer getMax(int input, int result) {
		if(input < 2){
			return result;
		}
		
		if(input == 2){
			result ++;
			return result;
		}
		
		int temp = input/3;
		input = input%3;
		return getMax(temp+input, result+temp);
	}

}
