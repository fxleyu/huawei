package com.huawei.page01.pro1966;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int position = 0;
		int total = 0;
		
		while(scanner.hasNext()){
			i++;
			int temp = scanner.nextInt();
			if(temp>=0){
				position++;
				total += temp;
			}
		}
		
		scanner.close();
		
		System.out.println(i-position);
		if(position == 0){
			System.out.println(0.0);
		}else{
			System.out.println(((double)total)/position);

		}
	}

}
