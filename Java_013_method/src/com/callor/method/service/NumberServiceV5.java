package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {
	
	public Integer inputNum(String title) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println(title + "값을 입력하세요");
			System.out.println("QUIT : 입력취소");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intInput = null;
			
			if(strInput.equals("QUIT")) {
				return null;
			} else {
				try {
					intInput = Integer.valueOf(strInput);
				} catch (Exception e) {
					System.out.println("정수 또는 QUIT만 입력");
					continue;
				}
			} 
			if(intInput < 0 || intInput > 100) {
				System.out.println("0 ~ 100까지 범위만 입력");
				continue;
			}
			return intInput;
		}
		
	}

/*	
	public Integer inputNum(String title) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.printf("%d 값을 입력하세요" , title);
			System.out.println("QUIT : 입력중단");
			System.out.print(">> ");
			title = scan.nextLine();
			Integer intNum = null;

			if (title.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(title);
				} catch (Exception e) {
					System.out.println("입력 오류 정수만 입력");
					continue;
				}
			} // if end

			if (intNum < 0 || intNum > 100) {
				System.out.println("0 ~ 100까지의 범위만 입력");
				return intNum;
			}
		}
		

	} */
}
