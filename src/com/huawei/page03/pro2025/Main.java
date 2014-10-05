package com.huawei.page03.pro2025;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] amat = new int[a][b];
		int[][] bmat = new int[b][c];
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				amat[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<b; i++){
			for(int j=0; j<c; j++){
				bmat[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		int[][] result = getResult(amat, bmat);
		for(int i=0; i<amat.length; i++){
			System.out.println(getPrintString(result, i));
		}
	}

	private static String getPrintString(int[][] matrix, int i) {
		String result = "";
		for(int j =0; j< matrix[0].length; j++){
			result += " "+matrix[i][j];
		}
		return result.trim();
	}

	private static int[][] getResult(int[][] amat, int[][] bmat) {
		int[][] result = new int[amat.length][bmat[0].length];
		
		for(int i=0; i<result.length; i++){
			for(int j=0; j< result[0].length; j++){
				int temp = 0;
				for(int k=0; k<amat[0].length; k++){
					temp += amat[i][k]*bmat[k][j];
				}
				result[i][j] = temp;
			}
		}
		return result;
	}

}
