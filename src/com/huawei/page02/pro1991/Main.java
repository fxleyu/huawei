package com.huawei.page02.pro1991;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt(), sc.nextInt()));
		sc.close();
	}

	private static int getResult(int a, int b) {
		int[][] matrix = new int[a+2][b+2];
		matrix[1][1] = 1;
		
		for(int i=1; i<matrix.length; i++){
			for(int j=1; j<matrix[0].length; j++){
				matrix[i][j] += matrix[i-1][j] +matrix[i][j-1];
			}
		}
		
		return matrix[a+1][b+1];
	}

}
