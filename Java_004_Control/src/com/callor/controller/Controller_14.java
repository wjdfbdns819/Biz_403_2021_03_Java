package com.callor.controller;

import java.util.Random;

public class Controller_14 {
	
	public static void main(String[] args) {
		/*1 ~ 100 까지의 임의의 수로 국어, 영어, 수학 3과목의 점수와 총점, 평균 구하시오 */
		// 평균 소수점 이하 둘째 자리까지
		Random rnd = new Random();
		int intKor = 0;
		int intEng = 0;
		int intMath = 0; // 변수 선언
		
		 intKor = rnd.nextInt(100) + 1;
		 intEng = rnd.nextInt(100) + 1;
		 intMath = rnd.nextInt(100) + 1;
		
		/* int intSum1 = intKor + intEng + intMath; 이렇게 쓰는 것 보단 아래 코드처럼 하는게 좋음*/
		 int intSum = intKor;
		 intSum += intEng;
		 intSum += intMath;
		 
		 float floatAvg = (float)intSum / 3; // => 소수점 이하 구하는 코드 복습하기
		 
		
		
		
		
		
		
		
		System.out.println("=================");
		System.out.printf("국어: %d\n", intKor);
		System.out.printf("영어: %d\n", intEng);
		System.out.printf("수학: %d\n", intMath);
		System.out.println("----------------");
		System.out.printf("총점: %d ,평균: %3.2f\n", intSum, floatAvg);
		System.out.println("================");
	}
}
