package com.callor.method.service;
// 배열 사용 x 
public class NumberServiceV7 {
	protected InputService inService;
	
	public NumberServiceV7() {
		inService = new InputService();
	}

	public Integer InputScore() {
		
		Integer intKor = null;
		while (true) {
			intKor = inService.inputValue("국어");
			if (intKor == null) {

			} else if (intKor < 0 || intKor > 100) {
				System.out.println("점수는 0 ~ 100 범위까지만 입력가능");
			} else {
				continue;

			}
			break;
		}
		
		Integer intEng = null;
		while(true) {
			intEng = inService.inputValue("영어");
			if (intEng == null) {

			} else if (intEng < 0 || intEng > 100) {
				System.out.println("점수는 0 ~ 100 범위까지만 입력가능");
			} else {
				continue;

			}
			break;
		}
		Integer intMath = null;
		while(true) {
			intMath = inService.inputValue("수학");
			if (intMath == null) {

			} else if (intMath < 0 || intMath > 100) {
				System.out.println("점수는 0 ~ 100 범위까지만 입력가능");
			} else {
				continue;

			}
			break;
		}
		Integer intSci = null;
		while(true) {
			 intSci = inService.inputValue("과학");
			if (intSci == null) {

			} else if (intSci < 0 || intSci > 100) {
				System.out.println("점수는 0 ~ 100 범위까지만 입력가능");
			} else {
				continue;
			}
			break;
		}
		Integer intHis = null;
		while(true) {
			intHis = inService.inputValue("점수 0 ~ 100까지 입력");
			if (intHis == null) {

			} else if (intHis < 0 || intHis > 100) {
				System.out.println("점수는 0 ~ 100 범위까지만 입력가능");
			} else {
				continue;
			}
			break;
		}
		return null;
	}
}
