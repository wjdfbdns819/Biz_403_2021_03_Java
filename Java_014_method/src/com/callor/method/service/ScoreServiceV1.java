package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	
	Scanner scan;
	
	
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public Integer inputScore() {
		System.out.println("국어점수 입력");
		System.out.print(">> ");
		String strNum = scan.nextLine();

		Integer retNum = null;
		retNum = Integer.valueOf(strNum);
		
		if(retNum == null) {
			System.out.println("종료");
			return null;
			
		} else {
			System.out.printf("점수 : %d", retNum);
			return retNum;
		}
			
		
	}
	
}
