package com.callor.controller;

import java.util.Random;

public class Controller_10 {

	public static void main(String[] args) {
		
		/*
		 * 0 ~ 100까지 중의 임의의 정수 5개를 만들어서 그 수가 짝수인지 아닌지를
		 * 	출력
		 */
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		int num3 = rnd.nextInt(100);
		int num4 = rnd.nextInt(100);
		int num5 = rnd.nextInt(100);
		
		/* 단순하게 5번 반복한것 */
		if(num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수");
		} else { System.out.println(num1 + "는 짝수아님");
		
		}
		if(num2 % 2 == 0) {
			System.out.println(num2 + "는 짝수");
		} else { System.out.println(num2 + "는 짝수아님");
		
		}
		if(num3 % 2 == 0) {
			System.out.println(num3 + "는 짝수");
		} else { System.out.println(num3 + "는 짝수아님");
		
		}
		if(num4 % 2 == 0) {
			System.out.println(num4 + "는 짝수");
		} else { System.out.println(num4 + "는 짝수아님");
		
		}if(num5 % 2 == 0) {
			System.out.println(num5 + "는 짝수");
		} else { System.out.println(num5 + "는 짝수아님");
		
		}
		/*
		 * 반복문을 사용하여 임의 정수 100을 만들고 그 수가 짝수인지 아닌지 판별하는 코드임
		 */
		System.out.println("===========");
		for(int i = 0 ; i < 5 ; i++) {
			
			int num = rnd.nextInt();
			if(num % 2 == 0) {
				System.out.println(num + "는 짝수");
			} else {System.out.println(num + "는 짝수 아님");
			
			
			}
		}
	}
}
