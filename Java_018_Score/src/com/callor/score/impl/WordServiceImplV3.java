package com.callor.score.impl;

public class WordServiceImplV3 extends WordSerivceImplV2 {

	@Override
	public void selectMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("영단어 게임");
			System.out.println("-".repeat(50));
			System.out.println("1. 영단어 맞추기");
			System.out.println("2. 단어 배열");
			System.out.println("QUit : 입력중단");
			System.out.print(">> ");
			String strM = scan.nextLine();
			
			if(strM.equals("QUit")) {
				System.out.println("입력중단");
				return;
			}
			
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("메뉴는 정수 or QUit만 입력");
			}
			
			if(intM == 1) {
				this.viewWord1();
			} else if(intM == 2) {
				this.viewWord2();
			}
		}
		
	}
}