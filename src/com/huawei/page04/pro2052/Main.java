package com.huawei.page04.pro2052;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new BigDecimal(sc.nextLine()).add(new BigDecimal(sc.nextLine())));
		sc.close();
	}

}
