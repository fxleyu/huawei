package com.huawei.page02.pro1985;

import java.util.Scanner;

public class Main {
	
	private static char[] NUM_CHAR = {'Áã','Ò¼','·¡','Èþ','ËÁ','Îé','Â½','Æâ','°Æ','¾Á'};
	private static String[] LOC = {"", "Ê°","°Û","Çª"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResultString(sc.nextDouble()));
		sc.close();
	}

	private static String getResultString(double num) {
		String money = ""+num;
		String result = "ÈËÃñ±Ò";
		result += getMoneyString(money.substring(0, money.indexOf(".")).toCharArray())+"Ôª";
		if(money.substring(money.indexOf(".")+1).equals("0")){
			result +="Õû";
		}else{
			result += getEndString(money.substring(money.indexOf(".")+1).toCharArray());
		}
		
		return result;
	}

	private static String getEndString(char[] chs) {
		String result = "";
		if(chs[0] == '0'){
			result += "Áã";
		} else {
			result += NUM_CHAR[Integer.valueOf(""+chs[0])]+"½Ç";
		}
		
		if(result.length() <2){
			return result;
		}
		
		if(chs[1] != '0'){
			result += NUM_CHAR[Integer.valueOf(""+chs[1])]+"·Ö";
		}
		return result;
	}

	private static String getMoneyString(char[] chs) {
		String result = "";
		
		if(chs.length > 8){
			result += getMoneyString(getYiMoney(chs)) + "ÒÚ";
		}
		
		if(chs.length > 4 && !isWangIsZero(chs)){
			result += getFourNumString(chs, 4) + "Íò";
		}
		
		result += getFourNumString(chs, 0);
		return result;
	}

	private static boolean isWangIsZero(char[] chs) {
		for(int i = 4; i<chs.length && i<8; i++){
			if(chs[i] != '0'){
				return false;
			}
		}
		return true;
	}

	private static String getFourNumString(char[] chs, int k) {
		char[] temp = getRealArray(chs, k);
		reverse(temp, 0, temp.length-1);
		String result = "";
		boolean flag= false;
		for(int i = temp.length-1; i >=0; i--){
			if(temp[i] != '0'){
				if(i == 1 && temp[i] == '1'){
					result += LOC[i];
				} else {
					result += NUM_CHAR[Integer.valueOf(""+temp[i])]+LOC[i];
				}
				
				flag = false;
			} else {
				if(!flag){
					result += "Áã";
				}
				flag = true;
			}
		}
		return result;
	}

	private static char[] getRealArray(char[] chs, int k) {
		reverse(chs, 0, chs.length-1);
		if(chs.length - k >= 4){
			char[] result = new char[4];
			for(int i = 0; i<result.length; i++){
				result[i] = chs[i+k];
			}
			reverse(chs, 0, chs.length-1);
			reverse(result, 0, result.length-1);
			return result;
		} else{
			char[] result = new char[chs.length - k];
			for(int i = 0; i<result.length; i++){
				result[i] = chs[i+k];
			}
			reverse(chs, 0, chs.length-1);
			reverse(result, 0, result.length-1);
			return result;
		}
	}

	private static char[] getYiMoney(char[] chs) {
		reverse(chs, 0, chs.length-1);
		char[] result = new char[chs.length - 8];
		
		for(int i=0; i<result.length; i++){
			result[i] = chs[i+8];
		}
		reverse(chs, 0, chs.length-1);
		reverse(result,0 , result.length-1);
		return result;
	}

	private static void reverse(char[] chs, int i, int j) {
		while(i<j){
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
			i++;
			j--;
		}
	}

}
