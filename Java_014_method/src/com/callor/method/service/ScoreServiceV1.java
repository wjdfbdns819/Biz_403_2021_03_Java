package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	
	Scanner scan;

	
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public Integer inputScore() {
	
		
		Integer retNum; 
		
		if(retNum == null) {
			System.out.println("종료");
			return null;
			
		} else {
			System.out.printf("점수 : %d", retNum);
			return retNum;
		}
			
		
	}
	
}
