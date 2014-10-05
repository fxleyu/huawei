package com.huawei;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args){
		String str = "1";
		System.out.println(">>>>>>>>>"+str.substring(1));
		List<String> list = new ArrayList<String>();
		list.add("fxleyu");
		List<String> unk = new ArrayList<String>(list);
		System.out.println(unk.toString());
		list.add("fxyuer");
		System.out.println(unk.toString());
		System.out.println(list.toString());
	}
}
