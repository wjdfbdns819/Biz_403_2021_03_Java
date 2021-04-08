package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {
	protected Scanner scan;
	
	public InputServiceV1() {
		
		scan = new Scanner(System.in);
	}
	
	public Integer InputValue(String title) {
		
		while(true) {
			System.out.println(title 
					+ "값을 입력하세요(QUIT: 입력중단)");
			System.out.print(">> ");
			String strNum = scan.nextLine();
			
			if(strNum.equals("QUIT")) {
				return null;
			}
			
				Integer intNum = null;
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					System.out.println("값은 정수 또는 QUIT만 입력");
					continue;
				}
				return intNum;
		} 
	} // InputValue title
	
	
	public Integer InputValue(String title, int start) {
		
		title = String.format("%s(%d 이상)",title, start);
		
		Integer num = this.InputValue(title);
		
		return null;
	}
}
