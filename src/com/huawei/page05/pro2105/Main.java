package com.huawei.page05.pro2105;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] result = getResult(sc.nextInt());
		sc.close();
		
		for(int[] x : result){
			System.out.println(getStr(x));
		}
	}

	private static String getStr(int[] x) {
		String result = "";
		for(int i : x){
			result += i + " ";
		}
		return result.trim();
	}

	private static int[][] getResult(int len) {
		int[][] result = new int[len][];
		int j=0;
		for(int i=len; i>0; i--){
			result[j] = new int[i];
			j++;
		}
		
		int k=1;
		result[0][0] = 1;
		for(int i=1; i<len; i++){
			int ai = i;
			int aj = 0;
			for(j=0; j<=i; j++){
				result[ai--][aj++] = ++k; 
			}
		}
		
		return result;
	}
}
