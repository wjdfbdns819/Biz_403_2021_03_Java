package com.callor.Values;

public class Values_02 {

	public static void main (String [] args) {
		
		/*
		 * 1. 반지름이 23인 원의 둘레와 넓이를 계산하여 출력
		 * 	 - 원의 둘레: 반지름 * 2 * 3.14
		 *   - 원의 넓이: 반지름 * 반지름 * 3.14
		 */
		System.out.println("=========================");
		System.out.println("원의 둘레, 넓이");
		System.out.println("=========================");
		System.out.println("반지름이 23인 원");
		System.out.print("둘레 :");
		System.out.println(23 * 2 * 3.14);
		System.out.print("넓이 :");
		System.out.println(23 * 23 * 3.14 );
		
		System.out.println("=========================");
		System.out.println("둘레 :" + (23 * 2 * 3.14) );
		System.out.println("넓이 :" + (23 * 23 * 3.14) );
		
		System.out.print("원의 둘레: 23(반지름) * 2 * 3.14 =");
		System.out.println(23 * 2 * 3.14);
		
		System.out.print("원의 넓이: 23(반지름) * 23(반지름) * 3.14 =");
		System.out.println(23 * 23 * 3.14);
		
	}
}