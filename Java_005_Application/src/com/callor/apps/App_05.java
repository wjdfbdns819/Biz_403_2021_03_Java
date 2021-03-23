package com.callor.apps;

import java.util.Random;

public class App_05 {
/*
 * 5명 학생 성적 계산
 * 과목 국어,영어,수학이며 과목의 점수는 Random클래스 사용하여 50 ~ 100까지 생성하여 사용
 * 학생의 성적리스트 출력
 */
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int [] members = new int [5]; // 학생 배열
		
		// 과목3가지를 학생수 만큼 배열 선언
		int [] intKors = new int [5];
		int [] intEngs = new int [5];
		int [] intMaths = new int [5];
			
		// 가상의 점수를 생성하기
		for(int i = 0 ; i <5 ; i++) {		
			intKors[i] = rnd.nextInt(51) + 50;
			intEngs[i] = rnd.nextInt(51) + 50;
			intMaths[i] = rnd.nextInt(51) + 50;
		}
		
		// 학생별로 총점과 평균을 계산하여 저장해두기
		int [] intTotal = new int[5];
		float[] floatAvg = new float[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			
			intTotal[i] = intKors[i];
			intTotal[i] += intEngs[i];
			intTotal[i] += intMaths[i];
			floatAvg[i] = (float)intTotal[i] /3;
		}
		int intKorTotal = 0;
		int intEngTotal = 0;
		int intMathTotal = 0;
		
		int intAllTotal = 0;
		
		// 리스트 출력하기		
		System.out.println("================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------");
		
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.print((i + 1) + "\t");
			System.out.print(intKors[i] + "\t");
			System.out.print(intEngs[i] + "\t");
			System.out.print(intMaths[i] + "\t");
			
			System.out.print(intTotal[i] +"\t");
			System.out.printf("%3.2f\n",floatAvg[i]);
			// 과목별 총점
			intKorTotal += intKors[i];
			intEngTotal += intEngs[i];
			intMathTotal += intMaths[i];
			// 과목 총점
			intAllTotal += intTotal[i];
		}
		
		System.out.println("====================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\n", intKorTotal, intEngTotal, intMathTotal, intAllTotal);
		
		
		
	}
}
