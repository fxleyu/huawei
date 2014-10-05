package pro03;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(getTheSum(sc.nextLine().trim()));
		
		sc.close();
	}

	private static String getTheSum(String line) {
		String[] nums = line.split(" ");
		BigInteger one = getBigIntegerValue(nums[0]);
		BigInteger other = getBigIntegerValue(nums[1]);
		return one.add(other).toString();
	}

	private static BigInteger getBigIntegerValue(String num) {
		int index = num.indexOf(".");
		
		if(index == -1){
			return new BigInteger(num);
		}
		
		return new BigInteger(num.substring(0, index));
	}
}
