package pro01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat(".#");
		
		double len  = sc.nextFloat();
		int time = sc.nextInt();
		if(len<=2.0 && time<10){
			System.out.println(decimalFormat.format(6.0));
		} else {
			System.out.println(decimalFormat.format(Math.max(getMoney(len), getTimeMoney(time))));
		}
		
		sc.close();
	}

	private static double getTimeMoney(int time) {
		return ((int)(time-10)/3)*1.4 + 6;
	}

	private static double getMoney(double len) {
		double result = 6;
		result += ((int)((len-2)/0.5))* 0.7 ;
		if(len > 0.7) {
			int temp = (int) (len - 7);
			result += temp*0.7;
		}
		return result;
	}
}
