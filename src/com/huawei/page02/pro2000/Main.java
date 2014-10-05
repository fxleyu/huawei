package com.huawei.page02.pro2000;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		for(int i=0; i<10; i++){
			input[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] output = getResult(input);
		for(int temp : output){
			System.out.println(temp);
		}
	}

	private static int[] getResult(int[] input) {
		int[] result = new int[5];
		
		result[0] = init(input[0], input[1]);
		result[1] = swap(input[0], input[1], input[2], input[3], input[4], input[5]);
		result[2] = insert(input[0], input[6]);
		result[3] = insert(input[1], input[7]);
		result[4] = isRight(input[0], input[1],input[8],input[9]) ? 0 : -1;
		return result;
	}

	private static int insert(int row, int i) {
		if(row<8 && i>=0 && i<= row){
			return 0;
		}
		return -1;
	}

	private static int swap(int row, int col, int ai, int aj, int bi, int bj) {
		if(isRight(row, col, ai, aj) && isRight(row, col, ai, aj)){
			return 0;
		}
		return -1;
	}

	private static boolean isRight(int row, int col, int ai, int aj) {
		if(ai>=0 && ai< row && aj >=0 && aj < col){
			return true;
		}
		return false;
	}

	private static int init(int i, int j) {
		if(i>=0 && i<=9 && j>=0 && j<= 9){
			return 0;
		}
		return -1;
	}

}
