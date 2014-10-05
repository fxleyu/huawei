package com.huawei.page03.pro2005;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine(), sc.nextLine()));
		sc.close();
	}

	private static String getResult(String a, String b) {
		if(a.equals(b)){
			return 1+"";
		}
		
		char[] achs = a.toCharArray();
		char[] bchs = b.toCharArray();
		int[][] matrix = new int[achs.length+1][bchs.length+1];
		
		for(int i=0; i<matrix.length;i++){
			matrix[i][0] = i;
		}
		for(int i=0; i<matrix[0].length;i++){
			matrix[0][i] = i;
		}
		
		for(int i=1; i<matrix.length; i++){
			for(int j=1; j<matrix[0].length; j++){
				int min = matrix[i-1][j-1];
				if(achs[i-1] != bchs[j-1]){
					min++;
				}
				
				int temp = Math.min(matrix[i][j-1], matrix[i-1][j])+1;
				matrix[i][j] = Math.min(min, temp);
			}
		}
		
		return 1+"/"+(matrix[achs.length][bchs.length]+1);
	}

}
