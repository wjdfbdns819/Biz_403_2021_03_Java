package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		String strKor ="";
		String strEng = "";
		String strMath = "";
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		int intSum = 0;
		int intAvg = 0;
		
		intSum = intKor + intEng + intMath;
		/* intSum =inKor;
		 * intSum += intEng;
		 * intSum += intMath; 로도 씀 
		 */
		
		intAvg = intSum / 3;
		
		System.out.println("======================");
		
		System.out.printf("%s 국어: %d\n", strKor, intKor);
		
		System.out.printf("%s 영어: %d\n", strEng, intEng);
		
		System.out.printf("%s 수학: %d\n", strMath, intMath);
		
		System.out.println("-----------------------");
		// \t 는 Tab키를 누른것(한칸 비워두는 것) 과 같음
		System.out.printf("총점: %d\t평균: %d\n", intSum, intAvg);
		System.out.println("=======================");
				
		/*
		 * printf() 사용하여 출력할대
		 * %d : 정수(십진수)
		 * 		%3d : 자릿수를 3개로 맞추고 값을 오른쪽 정렬
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * \n : Enter를 누른것 처럼 줄바꿈을 실행
		 * \t : Tab 키를 누른것처럼 사이띄기를 일정하게 맞추어라
		 */
		
		
		
		
	}
}
