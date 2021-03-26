package com.callor.apps.service;

public class LinesService {

	public static String dLines(int length) {
		
		/*
		 * 누군가 LinesService.dLines(10) 형식으로 호출을 하면
		 *  	=> 문자열을 10개 생성하여 return하라
		 *  
		 *  LinesService.sLines(20)
		 *  	=> 문자열을 20개 생성하여 return하라
		 *  
		 */
		
		String dLine ="";
		for(int i = 0 ; i < length ; i++) {
			dLine += "="; // length가 5개라면 : =====
		}
		return dLine; // => 호출한 곳으로 보내라는 것
	}
	
	public static String sLines(int length) {
		String sLine = "";
		for(int i = 0 ; i < length ; i++) {
			sLine += "-";
		}
		return sLine;
	}
	
}
