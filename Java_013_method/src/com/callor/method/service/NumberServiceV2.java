package com.callor.method.service;

import java.util.Scanner;



public class NumberServiceV2 {

	/*
	 *  정수를 키보드에서 입력받아 정수를 return 하거나 : int 
	 *  QUIT를 입력하면 null을 return : AND = > Integer
	 *  voide 대신 Integer
	 */
	
	
	public Integer inputNum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 0 ~ 100까지 중 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.print(">> ");
		String strNum =scan.nextLine();
		if(strNum.equals("QUIT")) {
			return null;
		} else {
			Integer intNum = Integer.valueOf(strNum);
			return intNum;
		}
	}
	
	/*
	public Integer inputNum() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요(입력 취소 : QUIT)");
		Integer num = scan.nextInt();
		
		
		if(0 < num && 100 > num) {
			return num;
		}
		
		
		 num = String.valueOf();
		if(num.equals("QUIT")) {
			return null;
		}
		return 0; 
		
	} // intputNum */
}
