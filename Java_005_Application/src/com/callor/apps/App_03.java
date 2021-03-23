package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열 intScores 10개 선언 Random 클래스로 50 ~ 100까지 정수를 intScores에 저장
 * 
 * instScores 점수의 총점, 평균
 */
public class App_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int [] intScores = new int[10];//배열
		
		
		for(int i = 0 ; i < 10 ; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
			
		} // 10개의 Random 수 배열
		
		int intTotal = 0;
		float floatAvg = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			intTotal += intScores[i];
		}
		
		floatAvg =(float) intTotal / 10 ;
		// 평균은 전체 총점을 계산한 후에 한번만 계산을 수행하면 된다 평균을 총점과 같이 for()반복문에서 계산할 필요 없음
		
		System.out.println("==================");
		System.out.printf("총점: %d", intTotal);
		System.out.printf("평균: %3.2f\n", floatAvg);
		System.out.println("==================");
	
	}
}
