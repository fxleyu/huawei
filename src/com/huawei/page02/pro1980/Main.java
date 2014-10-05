package com.huawei.page02.pro1980;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(calcAutomorphicNumbers(sc.nextInt()));
		sc.close();
	}

	private static int calcAutomorphicNumbers(int num) {
		int result = 0;
		for(int i=0; i<= num; i++){
			if(isAutomorphicNumbers(i)){
				result++;
			}
		}
		return result;
	}

	private static boolean isAutomorphicNumbers(int i) {
		int i2 = i * i;
		String a = ""+i;
		String b = ""+i2;
		if(b.substring(b.length()-a.length()).equals(a)){
			return true;
		}
		return false;
	}

}
