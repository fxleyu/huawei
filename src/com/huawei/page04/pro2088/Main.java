package com.huawei.page04.pro2088;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		for(int i=0; i< matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		List<String> result = getResult(matrix);
		for(String string : result){
			System.out.println(string);
		}
	}

	private static List<String> getResult(int[][] matrix) {
		List<List<String>> result = new ArrayList<List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("(0,0)");
		result.add(list);

		while(true){
			List<List<String>> tempResult = new ArrayList<List<String>>();
			for(List<String> path : result){
				String end = path.get(path.size()-1);
				int x = Integer.valueOf(end.substring(1, end.indexOf(",")));
				int y = Integer.valueOf(end.substring(end.indexOf(",")+1, end.indexOf(")")));
				if(x-1>=0 && matrix[x-1][y] ==0){
					List<String> newPath = new ArrayList<String>(path);
					newPath.add("("+(x-1)+","+y+")");
					tempResult.add(newPath);
				}
				if(x+1 < matrix.length && matrix[x+1][y] ==0){
					List<String> newPath = new ArrayList<String>(path);
					newPath.add("("+(x+1)+","+y+")");
					if(x+1 == matrix.length-1 && y == matrix[0].length-1){
						return newPath;
					}
					tempResult.add(newPath);
				}
				if(y-1 >=0 && matrix[x][y-1] ==0){
					List<String> newPath = new ArrayList<String>(path);
					newPath.add("("+(x)+","+(y-1)+")");
					tempResult.add(newPath);
				}
				if(y+1< matrix[0].length && matrix[x][y+1] ==0){
					List<String> newPath = new ArrayList<String>(path);
					newPath.add("("+(x)+","+(y+1)+")");
					if(x == matrix.length-1 && y+1 == matrix[0].length-1){
						return newPath;
					}
					tempResult.add(newPath);
				}
			}
			result = tempResult;
		}
	}
}
