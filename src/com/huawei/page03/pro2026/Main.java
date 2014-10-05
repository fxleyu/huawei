package com.huawei.page03.pro2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Character, String> map = new HashMap<Character, String>();
		int total = sc.nextInt();
		for(int i=0; i< total; i++){
			char ch = (char)('A'+i);
			String result = ""+sc.next();
			result += " "+sc.next();
			map.put(ch, result);
		}
		String str = sc.next();
		
		sc.close();
		
		System.out.println(getResult(map, str));
		
	}

	private static int getResult(Map<Character, String> map, String str) {
		Stack<Character> stack = new Stack<Character>();
		int result = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==')'){
				while(stack.peek() != '('){
					char ch = stack.pop();
					if(stack.peek() == '('){
						stack.pop();
						stack.push(ch);
						break;
					} else {
						char other = stack.pop();
						char temp = (char)('A'+map.size());
						String strO = map.get(other);
						String strC = map.get(ch);
						result += Integer.valueOf(strO.substring(0, strO.indexOf(" ")))*Integer.valueOf(strO.substring(strO.indexOf(" ")+1))*Integer.valueOf(strC.substring(strC.indexOf(" ")+1));
						map.put(temp, Integer.valueOf(strO.substring(0, strO.indexOf(" ")))+" "+Integer.valueOf(strC.substring(strC.indexOf(" ")+1)));
						stack.push(temp);
					}
				}
			} else {
				stack.push(str.charAt(i));
			}
		}
		
		return result;
	}

}
