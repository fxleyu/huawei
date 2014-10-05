package com.huawei.page01.pro1957;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getInt(scanner.nextDouble()));
		scanner.close();
	}

	private static int getInt(double nextDouble) {
		int temp = (int)(nextDouble*10);
		
		if(temp >= 0){
			if(temp % 10 < 5){
				return temp/10;
			}else {
				return temp/10 +1;
			}
		}
		if(temp%10 ==0 || temp%10 > -5){
			return temp/10;
		}
		
		return temp/10 -1;
	}
}
