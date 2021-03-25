package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {
		
		int num1 = 9; 
		int num2 = 11;
		
		// 9가 소수가 아님을 알려주기
		for(int index = 2 ; index < num1 ; index++ ) {
			
			// 비교 연산문에서 결과가 한번이라도 true가 되면
			if(num1 % index == 0 ) {
				System.out.println(num1 + "은 소수가 아님"); break;
				
				// num1 의 값이 소수가 아니더라도 계속해서 소수라는 메시지가 출력된다 
			} else { System.out.println(num1 + "은 소수다");}
		}
		// 11이 소수인 것을 판별하라
		boolean notPrime = false; // => flag 변수
		
		for(int index = 2 ; index < num2 ; index++) {
			if(num2 % index == 0 ) {
				// num2가 소수가 아닌것이 발견되면
				// notPrime 변수에 true를 설정
				notPrime = true; // => flag 변수의 setting
				break;
			}
		}
		
		// for() 반복문이 모두 완료되었거나 중간에 break를 만나서 중단되었거나
		
		// setting 되거나 그렇지 않은 경우를 판단하여 결과를 출력하기
		if(notPrime) { // notPrime == true인 경우
			// num2 가 소수가 아닌경우이다
			System.out.println(num2 + "는 소수가 아님"); } 
		else { System.out.println(num2 + "는 소수임"); }
		
		
		System.out.println("=========================");
		int num = 0;
		for(num = 2 ; num < num2 ; num++ ) {
			
			if(num2 % num == 0 ) {
				break;
			}
		}
		System.out.printf("num2 : %d, num : %d" , num2, num);
		
		/*
		 * for() 반복문에서 사용한 num(index 변수)를 
		 * for() 반복문 시작전에 선언을 하고 실행을 하면 
		 * for() 반복문이 종료된 후에 num값을 읽을 수 있다
		 * 
		 * 이때 
		 * 1. 만약 중간에 break를 만나서 for() 가 중단되거나
		 * 2. break 없이 for() 반복문이 모두 완료되거나 할텐데
		 * 	1과 2의 경우에 num 변수의 상태가 다름
		 * 
		 * 보통은 num 변수의 값은 조건문에 최대값과 같다
		 * 1번의 경우 num 값은 num2보다 항상 작다 
		 * 2번의 경우 num 값은 num2보다 크거나 같다
		 * 
		 * 	if(num == num2) 라는 비교문을 사용하는 것 보단
		 * 	if(num < num2) 조건물을 사용하는 것이 논리적인 문제를 최소화 할수 있다 
		 */ 
		
		// 조건문에서 값이 애매하게 만들어져 논리적 오류를 일으킬 가능성이 있다
		// num >= num2
		if(num == num2) {
			System.out.println(num2 + "소수이다");
		} else {
			System.out.println(num2 + "는 소수가 아님");
		}
		
		// 논리적인 오류를 최소화 하기 위하여 비교연산자를 1개만 사용하여 
		// 검사할 수 있는 코드를 사용하는 것이 좋다
		if(num < num2) {
			System.out.println(num2 + "소수이다");
		} else {
			System.out.println(num2 + "는 소수가 아님");
		}
	
		
		
		/* x */
		int [] intNumber = new int [20];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 20 ; i++ ) {
			intNumber[i] = rnd.nextInt(50) + 50; 
			
		}
		int number = 0;
		for (int i = 0 ;  i < 20 ; i++) {
			for(num1 = 50 ; num1 < 100 ; num1++) {
				
				if(num1 % 2 == 0) {
					
				}
				
			}
		}

		
		
		
		
		
	}
}
