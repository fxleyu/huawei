package com.huawei.page03.pro2007;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		System.out.println(new BigDecimal(a).add(new BigDecimal(b)).toString());
	}
}
