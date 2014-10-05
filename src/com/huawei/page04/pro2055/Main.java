package com.huawei.page04.pro2055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt()));
		sc.close();
	}

	private static int getResult(int num) {
		int result = 0;
		for(int i=1; i<=num; i++){
			if(isPrefaceNum(i)){
				result++;
			}
		}
		
		return result;
	}

	private static boolean isPrefaceNum(int i) {
		
		int temp = 0;
		for(int j=1; j<i; j++){
			if(i%j == 0){
				temp += j;
			}
		}
		
		return (temp == i)? true : false;
	}

}
