package com.huawei.page02.pro1997;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(theUsableLength(scanner.nextLine()));
		scanner.close();
	}

	private static int theUsableLength(String line) {
		if(line == null || line.length() < 1){
			return 0;
		}
		
		int result = 1;
		char[] data = line.toCharArray();
		for(int i=1; i<data.length; i++){
			for(int j = i-1; j>=0; j--){
				if( i+i-j < data.length){
					if(data[j] == data[i+i-j]){
						int temp = i+i-j-j+1;
						if(temp > result ){
							result = temp;
						}
					}else{
						break;
					}
				}
				
			}
			if(data[i] == data[i-1]){
				if(result < 2){
					result = 2;
				}
				for(int j = i-2; j>=0; j--){
					if(i+i-j-1 < data.length){
						if(data[j] == data[i+i-j-1]){
							int temp = i+i-j-j;
							if(temp > result ){
								result = temp;
							}
						}else{
							break;
						}
					}
					
				}
			}
		}
		return result;
	}

}
