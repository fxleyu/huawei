package com.huawei.page01.pro1964;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(cbrt(scanner.nextDouble()));
		scanner.close();
	}

	private static double cbrt(double input) {
		if(input==0){
			return 0;
		}
		
	    double x0 = input;
	    double x1 = (2*x0/3)+(input/(x0*x0*3));  
	    while(Math.abs(x1-x0)>0.0000001){  
	        x0=x1;  
	        x1=(2*x0/3)+(input/(x0*x0*3));  
	    }  
	    return x1;
	}

}
