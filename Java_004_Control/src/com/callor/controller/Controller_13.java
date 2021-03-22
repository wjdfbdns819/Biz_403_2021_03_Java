package com.callor.controller;

import java.util.Random;

public class Controller_13 {

	public static void main(String[] args) {
		/* 1 ~ 100까지의 범위 중 10 짝수인지 검수하고 짝수의 합을 구하라*/
		Random rnd = new Random();
		int intSum = 0;
		/*
		 * intSum변수를 어디에 선언할까?
		 * 짝수들을 어디에서 합산(누적)할까?
		 * 어디에서 출력을 할까? 즉 코드의 위치가 중요함
		 */
		for(int i = 0 ; i < 10 ; i++) {
			int num = rnd.nextInt(100) + 1;
			if(num % 2 == 0) {
				intSum += num;
			}	
		}
		System.out.println("==============");
		System.out.printf("합계 : %d\n", intSum);
		System.out.println("==============");
	}
}