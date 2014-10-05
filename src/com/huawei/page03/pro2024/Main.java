package com.huawei.page03.pro2024;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int sortParam = sc.nextInt();
		Score[] scores = new Score[total];
		
		for(int i=0; i<total; i++){
			scores[i] = new Score(sc.next(), sc.nextInt());
		}
		
		sc.close();
		
		if(sortParam == 1){
			sortScore(scores, new Comparator<Score>(){
				@Override
				public int compare(Score o1, Score o2) {
					return o1.score - o2.score;
				}
				
			});
		} else {
			sortScore(scores, new Comparator<Score>(){
				@Override
				public int compare(Score o1, Score o2) {
					return o2.score - o1.score;
				}
			});
		}
		
		for(Score score : scores){
			System.out.println(score.toString());
		}
	}
	
	private static void sortScore(Score[] scores, Comparator<Score> comp) {
		for(int i=scores.length-1; i>0; i--){
			for(int j = 0; j<i; j++){
				if(comp.compare(scores[j], scores[j+1])>0){
					Score s = scores[j];
					scores[j] = scores[j+1];
					scores[j+1] = s;
				}
			}
		}
	}

	static class Score{
		String name;
		int score;
		
		public Score(String name, int score){
			this.name = name;
			this.score = score;
		}

		@Override
		public String toString() {
			return name + " " + score;
		}
	}
}
