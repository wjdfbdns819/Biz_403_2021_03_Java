package com.callor.controller;

import java.util.Random;

public class Controller_11 {

	public static void main(String[] args) {
		
		/* Random random 을 rnd로 줄인것 */
		Random rnd = new Random();
		
		
		
		/*for(int i = 0 ; i < 5 ; i++) {
			
			int num =rnd.nextInt(101);
			if(num % 3 == 0 && num > 0) {
				System.out.println(num + "는(은) 3의 배수");
			} else {System.out.println(num + "는(은) 3의 배수 아님");
			
			}
		} */
		for(int i = 0 ; i < 5 ; i ++ ) {
			
			// 0 ~ 99까지 만들고
			int rndNum = rnd.nextInt(100);
			
			// 거기에 1을 더하여 num에 저장하라
			rndNum = rndNum + 1;

			// 한 명령문으로
			rndNum = rnd.nextInt(100) + 1;
			if(rndNum % 3 == 0) {
				System.out.println(rndNum + "는(은) 3의 배수");
			} else {System.out.println(rndNum + "는(은) 3의 배수가 아님");
				
			}
		}
		
	}
}
