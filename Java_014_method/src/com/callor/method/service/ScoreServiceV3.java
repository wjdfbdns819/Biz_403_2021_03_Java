package com.callor.method.service;

public class ScoreServiceV3 {

	InputServiceV2 inService;

	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}

	
	public void inputScore() {
		
		Integer intKor = inService.inputValue("국어", 0, 100);
		Integer intEng = inService.inputValue("영어", 0, 100);
		Integer intMath = inService.inputValue("수학", 0, 100);
		
		if(intKor == null) {
			System.out.println("입력종료");
			return; 
		}
		
		if(intEng == null) {
			System.out.println("입력종료");
			return; 
		}
		
		if(intMath == null) {
			System.out.println("입력종료");
			return; 
		}
		
		Integer intSum = intKor + intEng + intMath;
		float avg = (float) intSum /3;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + avg );
		
		/* 배열 x */
		/*Integer intKor 
					= this.inService.inputValue("국어", 0, 100);

		if (intKor == null) {
			System.out.println("입력종료");
		} else {
			System.out.printf("국어 점수 : %d\n", intKor);
		}

		Integer intEng 
					= this.inService.inputValue("영어", 0, 100);
		
		if (intEng == null) {
			System.out.println("입력종료");

		} else {
			System.out.printf("영어 점수: %d\n", intEng);
		}

		Integer intMath 
					= this.inService.inputValue("수학", 0, 100);
		
		if (intMath == null) {
			System.out.println("입력종료");

		} else {
			System.out.printf("수학 점수: %d\n", intMath);
		}
		
		Integer intSum = intKor + intEng + intMath;
		float floatAvg = intSum / 3;
		
		System.out.printf("총점 : %d, 평균: %3.2f", intSum, floatAvg); */
					   
		
	} 
	
	/* public void inputScores() {
		// 배열 
		String [] subject = {"국어", "영어", "수학"};
		for(int i = 0 ; i < subject.length ; i++) {
			this.inService.inputValue( subject[i], 0, 100);
			
			if(subject[i] == null) {
				system.out.println("입력종료");
			}
		}
		
		
	} */
	
}
