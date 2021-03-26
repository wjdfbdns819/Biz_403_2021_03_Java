package com.callor.apps.service;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreServiceV1 {

	
	public ScoreServiceV1 () {
	Scanner scan = new Scanner(System.in);
	

}
		
	public void makeKor () {
	Scanner scan = new Scanner(System.in);
	
	int [] intKor = new int[5];
	for(int i = 0 ; i < intKor.length; i++) {
		int num1 = i + 1; 
		System.out.printf("학생 %d >>", num1);
		intKor[i] = scan.nextInt();
	}
	System.out.println(LinesService.dLines(30));
	System.out.println("학생들의 국어 점수:");
	System.out.println(Arrays.toString(intKor));
	System.out.println(LinesService.sLines(30));
}

	public void makeEng () {
		Scanner scan = new Scanner(System.in);
		
		int [] intEng = new int [5];
	
	for(int i = 0 ; i < intEng.length; i++) {
		int num2 = i + 1; 
		System.out.printf("학생 %d >>", num2);
		intEng[i] = scan.nextInt();
	}
	System.out.println(LinesService.dLines(30));
	System.out.println("학생들의 영어 점수:");
	System.out.println(Arrays.toString(intEng));
	System.out.println(LinesService.sLines(30));
	
	}

	public void makeMath() {
		
		Scanner scan = new Scanner(System.in);
		int [] intMath = new int[5];
 		
		for(int i = 0 ; i < intMath.length; i++) {
			int num3 = i + 1; 
			System.out.printf("학생 %d >>", num3);
			intMath[i] = scan.nextInt();
		}
		System.out.println(LinesService.dLines(30));
		System.out.println("학생들의 수학 점수:");
		System.out.println(Arrays.toString(intMath));
		
	}
}