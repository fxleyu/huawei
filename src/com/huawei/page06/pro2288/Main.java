package com.huawei.page06.pro2288;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[sc.nextInt()];
		for(int i=0; i<input.length; i++){
			input[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println(getResult(input));
	}

	private static int getResult(int[] input) {
		if(input.length < 1){
			return 0;
		}
		
		int result = Integer.MAX_VALUE;
		
		for(int i=0; i<input.length; i++){
			int temp = removeNum(input, i);
			if(temp < result){
				result = temp;
			}
		}
		
		return result;
	}

	private static int removeNum(int[] input, int k) {
		int[] as = new int[k+1];
		int[] bs = new int[input.length -k];
		for(int i=0; i<as.length; i++){
			as[i] = input[i];
		}
		for(int i=0; i<bs.length; i++){
			bs[i] = input[k+i];
		}
		revArr(bs);
		
		return input.length - getLen(as) - getLen(bs) + 1;
	}

	private static int getLen(int[] as) {
		int[] num = new int [as.length];
		for(int i=0; i<num.length; i++){
			num[i] = 1;
		}
		
		for(int i=1; i<num.length; i++){
			for(int j=i-1; j>=0; j--){
				if(as[i]>as[j] && num[i]<=num[j]){
					num[i] = num[j]+1;
				}
			}
		}
		return num[num.length-1];
	}

	private static void revArr(int[] bs) {
		int i=0;
		int j =bs.length-1;
		while(i<j){
			int tem = bs[i];
			bs[i] = bs[j];
			bs[j] = tem;
			i++;
			j--;
		}
	}
}
