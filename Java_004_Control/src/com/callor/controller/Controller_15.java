package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] args) {
		/* 학생 10명의 국어 점수를 저장 / 1 ~ 100까지 범위의 임의 점수 생성 / 총점, 평균을 계산하여 출력 */
		/* 소수점 둘째자리까지 표기 */
		Random rnd = new Random();
		int intKor1 = 0;
		int intKor2 = 0;
		int intKor3 = 0;
		int intKor4 = 0;
		int intKor5 = 0;
		int intKor6 = 0;
		int intKor7 = 0;
		int intKor8 = 0;
		int intKor9 = 0;
		int intKor10 = 0;
		
			intKor1 = rnd.nextInt(100) + 1;
			intKor2 = rnd.nextInt(100) + 1;
			intKor3 = rnd.nextInt(100) + 1;
			intKor4 = rnd.nextInt(100) + 1;
			intKor5 = rnd.nextInt(100) + 1;
			intKor6 = rnd.nextInt(100) + 1;
			intKor7 = rnd.nextInt(100) + 1;
			intKor8 = rnd.nextInt(100) + 1;
			intKor9 = rnd.nextInt(100) + 1;
			intKor10 = rnd.nextInt(100) + 1;
			
		int intSum = intKor1;
			intSum += intKor2;
			intSum += intKor3;
			intSum += intKor4;
			intSum += intKor5;
			intSum += intKor6;
			intSum += intKor7;
			intSum += intKor8;
			intSum += intKor9;
			intSum += intKor10;		
		
		float floaAvg = (float)intSum / 10;	
		
		System.out.println("==================");
		System.out.println("학생1: " + intKor1);
		System.out.println("학생2: " + intKor2);
		System.out.println("학생3: " + intKor3);
		System.out.println("학생4: " + intKor4);
		System.out.println("학생5: " + intKor5);
		System.out.println("학생6: " + intKor6);
		System.out.println("학생7: " + intKor7);
		System.out.println("학생8: " + intKor8);
		System.out.println("학생9: " + intKor9);
		System.out.println("학생10: " + intKor10);
		System.out.println("----------------------");
		System.out.printf("총점: %d, 평균: %3.2f\n", intSum, floaAvg);
		System.out.println("=======================");
		
		/*for()은 오류가 남*/
		
		/*
		 * num 변수하고 intKor 이름하고 합하여 intKor1 ~ intKor10 처럼 만들수 있을것 같은데 안된다
		 * 
		 * intKorn
		 * intKornum = rnd.nextInt(100) + 1;
		 * 
		 */
		
		
		
		
	}
}
