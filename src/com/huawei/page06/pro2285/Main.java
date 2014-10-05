package com.huawei.page06.pro2285;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt()));
		sc.close();
	}

	private static int getResult(int max) {
		int result = 0;
		for(int i=1; i<=max; i++){
			if(i%7 == 0 || (i+"").indexOf(""+7) != -1){
				result++;
			}
		}
		return result;
	}

}
