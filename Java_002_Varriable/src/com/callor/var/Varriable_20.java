package com.callor.var;

public class Varriable_20 {

	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng = 80;
		
		int intSum = intKor + intEng;
		
		System.out.printf("%d + %d = %d", intKor, intEng, intSum);
		
		int avg = (intKor + intEng) / 2;
		avg = intSum /2;
		
		System.out.println("평균:" + avg );
		
		// 오류
		intKor = 91;
		intEng = 81;
		
		System.out.println("평균:" + avg);
		
		
		
	}
}
