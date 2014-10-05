package com.huawei;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class Testd {

	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();
		reader.nextLine();
		String name = "";
		String[] strs = new String[count];
		for(int i=0;i<count;i++){
			name = reader.nextLine();
			strs[i] = name;
		}
		for(int i=0;i<strs.length;i++){
			System.out.println(getDegree(strs[i]));
		}

	}
   
	public static int getDegree(String name){
		char[] cs = name.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int value = 1;
		for(int i=0;i<cs.length;i++){
			if(hm.containsKey(cs[i])){
				value = hm.get(cs[i])+1;
			}
			hm.put(cs[i], value);
		}
		Collection<Integer> c = hm.values();
		Object[] temp =  c.toArray();
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		int weight = 26;
		int sum = 0;
		for(int i=temp.length-1;i>=0;i--){
			sum+=((Integer)temp[i])*weight;
			weight--;
		}
		return sum;
	}
}