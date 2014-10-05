package com.huawei.page03.pro2036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine(), sc.nextInt()));
		sc.close();
	}

	private static String getResult(String line, int num) {
		if(line.length()<= num){
			return line;
		}
		int[] max = new int[line.length()-num+1];
		int maxValue = 0;
		int index = -1;
		for(int i=0; i<max.length; i++){
			for(int j=i; j< i+num; j++){
				if(line.charAt(j) == 'G' || line.charAt(j) == 'C'){
					max[i]++;
				}
			}
			if(max[i]> maxValue){
				maxValue = max[i];
				index = i;
			}
		}
		
		return line.substring(index, index+num);
	}
}
