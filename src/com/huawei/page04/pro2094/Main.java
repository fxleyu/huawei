package com.huawei.page04.pro2094;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextLine(), sc.nextLine(), sc.nextLine()));
		sc.close();
	}

	private static int getResult(String net, String ip1, String ip2) {
		int[] nets = getNets(net);
		if(nets == null){
			return 1;
		}
		
		int[] ip1s = getIps(ip1);
		int[] ip2s = getIps(ip2);
		
		if(ip1s ==null || ip2s == null){
			return 1;
		}
		
		for(int i=0; i<nets.length; i++){
			if((ip1s[i]&nets[i]) != (ip2s[i]&nets[i])){
				return 2;
			}
		}
		return 0;
	}

	private static int[] getIps(String ip) {
		String[] strs = ip.split("\\.");
		if(strs.length != 4){
			return null;
		}
		
		int[] result = new int[4];
		for(int i=0; i<result.length;i++){
			try{
				int temp = Integer.valueOf(strs[i]);
				if(temp>255 || temp <0){
					return null;
				}
				result[i] = temp;
			}catch(Exception e){
				return null;
			}
			
		}
		return result;
	}

	private static int[] getNets(String net) {
		int[] ips = getIps(net);
		if(ips == null){
			return ips;
		}
		
		String temp = "";
		for(int i=0; i<ips.length; i++){
			temp += getBiStr(ips[i]);
		}
		if(!isUse(temp)){
			return null;
		}
		
		return ips;
	}

	private static boolean isUse(String temp) {
		int index = temp.length();
		for(int i=0; i<temp.length(); i++){
			if(temp.charAt(i)!='1'){
				index = i;
				break;
			}
		}
		
		for(; index<temp.length(); index++){
			if(temp.charAt(index) == '1'){
				return false;
			}
		}
		
		return true;
	}

	private static String getBiStr(int value) {
		String str = Integer.toBinaryString(value);
		for(int i=str.length(); i<8;i++){
			str = "0"+str;
		}
		return str;
	}
}
