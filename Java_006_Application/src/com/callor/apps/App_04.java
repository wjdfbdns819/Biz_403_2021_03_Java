package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열 20개를 선언
 * Random 클래스를 사용하여 1 ~ 100까지 난수를 생성하여 배열에 저장
 * 배열에 저장된 정수중 짝수가 저장된 최초의 위치(첨자)는 몇 번인가 출력 
 */

public class App_04 {

	public static void main(String[] args) {
		
		// int intNums [ ] = new int[20]; 라고 적어도 문법상 오류는 없음
		int [] intNums = new int[20];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length ; i++ ) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0 ; i < intNums.length ; i ++ ) {
			if(intNums[i] % 2 == 0) { 
			
				System.out.print("짝수가 저장된 최초의 위치 :");
				System.out.println(i + "번");
			break;}
			
		}
		

		
		
		
	}
}
