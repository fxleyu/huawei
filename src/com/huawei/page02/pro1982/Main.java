package com.huawei.page02.pro1982;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int position = 0;
		int total = 0;
		
		for(int i=0; i<num; i++){
			int temp = scanner.nextInt();
			if(temp>=0){
				position++;
				total += temp;
			}
		}
		
		scanner.close();
		
		System.out.print((num-position)+" ");
		if(position == 0){
			System.out.println(0);
		}else{
			if(total%position == 0){
				System.out.println(total/position);
			} else {
				System.out.println(((double)((int)((double)total*10)/position))/10);
			}
		}
	}
}
