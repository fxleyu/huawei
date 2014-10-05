package pro02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(getNum(sc.nextInt(),sc.nextInt()));
		
		sc.close();
	}

	private static int getNum(int min, int max) {
		int num = 30;
		
		int start = min;
		
		if(min % num != 0){
			start = num * (min / num + 1);;
		}
		
		int realLen = max - start;
		if(realLen < 0){
			return 0;
		}
		
		return realLen / num + 1;
	}

}
