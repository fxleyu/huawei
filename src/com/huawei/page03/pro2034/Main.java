package com.huawei.page03.pro2034;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getCommonStr(sc.nextLine(), sc.nextLine()));
		sc.close();
	}

	private static String getCommonStr(String as, String bs) {
		int max = 0;
		int index = -1;
		char[] ach = as.toLowerCase().toCharArray();
		char[] bch = bs.toLowerCase().toCharArray();
		
		int[][] matrix = new int[as.length()+1][bs.length()+1];
		for(int i=1; i<matrix.length; i++){
			for(int j=1; j<matrix[i].length; j++){
				if(ach[i-1] == bch[j-1]){
					matrix[i][j] = matrix[i-1][j-1]+1;
					if(matrix[i][j] > max){
						max = matrix[i][j];
						index = i;
					}
				}
			}
		}
		
		return as.substring(index-max, index);
	}

}
