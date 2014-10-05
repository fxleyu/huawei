package com.huawei.page04.pro2071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node list = new Node();
		
		int total = sc.nextInt();
		Node temp = new Node();
		temp.value = sc.nextInt();
		list.next = temp;
		for(int i=1; i< total; i++){
			temp = new Node();
			temp.value = sc.nextInt();
			
			int head = sc.nextInt();
			Node index = list;
			while(index.next != null){
				index = index.next;
				if(index.value == head){
					temp.next = index.next;
					index.next = temp;
					break;
				}
			}
		}
		removeNode(list, sc.nextInt());
		
		sc.close();
		
		while(list.next != null){
			System.out.print(list.next.value+" ");
			list = list.next;
		}
		
	}
	
	private static void removeNode(Node list, int value) {
		Node index = list;
		while(index.next != null){
			if(index.next.value == value ){
				index.next = index.next.next;
			}else{
				index = index.next;
			}
		}
	}

	static class Node{
		int value;
		Node next;
	}

}
