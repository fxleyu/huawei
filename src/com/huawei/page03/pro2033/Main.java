package com.huawei.page03.pro2033;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getResult(sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextInt()));
		sc.close();
	}

	private static boolean getResult(int a, int b, int c, int d) {
		List<List<Integer>> papers = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		
		for(int i=0; i<4;i++){
			List<List<Integer>> papersTemp = new ArrayList<List<Integer>>();
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(list.get(i));
			papersTemp.add(temp);
			List<Integer> newNums = removeList(list, i);
			papersTemp = getAllList(papersTemp, newNums);
			papers.addAll(papersTemp);
		}
		
		String result = hasThe24(papers);
		if(result != ""){
			return true;
		}
		return false;
	}
	

	private static String hasThe24(List<List<Integer>> papers) {
		for(List<Integer> paper : papers){
			String result = hasThe24One(paper);
			if(result != ""){
				return result;
			}
		}
		return "";
	}

	private static String hasThe24One(List<Integer> paper) {
		String result = paper.get(0)+"";
		double value = paper.get(0);
		return hasThe24One(removeList(paper, 0), result, value);
		
	}

	private static String hasThe24One(List<Integer> paper, String result,
			double value) {
		if(paper.size() == 0){
			if(Math.abs(value - 24) < 0.001){
				return result;
			}
			return "";
		}
		
		String tempresult = add(paper, result, value);
		if(tempresult != ""){
			return tempresult;
		}
		
		tempresult = subs(paper, result, value);
		if(tempresult != ""){
			return tempresult;
		}
		
		tempresult = mult(paper, result, value);
		if(tempresult != ""){
			return tempresult;
		}
		
		tempresult = divid(paper, result, value);
		if(tempresult != ""){
			return tempresult;
		}
		
		return "";
	}

	private static String divid(List<Integer> paper, String result, double value) {
		List<Integer> x = removeList(paper, 0);
		String temp = result +"/"+paper.get(0);
		double tempD = value/paper.get(0);
		
		
		return hasThe24One(x, temp, tempD);
	}

	private static String mult(List<Integer> paper, String result, double value) {
		List<Integer> x = removeList(paper, 0);
		String temp = result +"*"+paper.get(0);
		double tempD = value*paper.get(0);
		
		
		return hasThe24One(x, temp, tempD);
	}

	private static String subs(List<Integer> paper, String result, double value) {
		List<Integer> x = removeList(paper, 0);
		String temp = result +"-"+paper.get(0);
		double tempD = value-paper.get(0);
		
		
		return hasThe24One(x, temp, tempD);
	}

	private static String add(List<Integer> paper, String result, double value) {
		List<Integer> x = removeList(paper, 0);
		String temp = result +"+"+paper.get(0);
		double tempD = value+paper.get(0);
		
		
		return hasThe24One(x, temp, tempD);
	}

	private static List<List<Integer>> getAllList(List<List<Integer>> papers,
			List<Integer> newNums) {
		if(newNums.size()<1){
			return papers;
		}
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		for(int i=0; i<newNums.size();i++){
			List<List<Integer>> papersTemp = new ArrayList<List<Integer>>();
			Integer iInteger = newNums.get(i);
			for(List<Integer> paper : papers){
				List<Integer> temp = new ArrayList<Integer>();
				temp.addAll(paper);
				temp.add(iInteger);
				papersTemp.add(temp);
			}

			List<Integer> newNumsTemp = removeList(newNums, i);
			papersTemp = getAllList(papersTemp, newNumsTemp);
			result.addAll(papersTemp);
		}
				
		return result;
	}

	private static List<Integer> removeList(List<Integer> nums, int k) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i< nums.size(); i++){
			if(i != k){
				result.add(nums.get(i));
			}
		}
		return result;
	}

}
