package com.huawei.page03.pro2029;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isMatch(sc.nextLine().toLowerCase(), sc.nextLine().toLowerCase()));
		sc.close();
	}

	private static boolean isMatch(String regex, String str) {
		if(regex.length() == 0 && str.length() == 0){
			return true;
		}else if(regex.length() == 0 && str.length() != 0){
			return false;
		}else if(regex.length() != 0 && str.length() == 0){
			return regex.length()==1 && regex.charAt(0)=='*';
		}
			
		if(regex.charAt(0) == '*'){
			for(int i=0; i<=str.length(); i++){
				if(isMatch(regex.substring(1), str.substring(i))){
					return true;
				}
			}
		}else if(regex.charAt(0) == '?'){
			return isMatch(regex.substring(1), str.substring(1));
		}else{
			if(regex.charAt(0) == str.charAt(0)){
				return isMatch(regex.substring(1), str.substring(1));
			}
		}
		return false;
	}

}
