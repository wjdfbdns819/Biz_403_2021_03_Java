package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(LinesService.dLines(20));
		System.out.println("두수의 사칙연산");
		System.out.println(LinesService.dLines(20));
		System.out.print("정수1 >> ");
		int num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		int num2 = scan.nextInt();
		System.out.println(LinesService.sLines(20));
		System.out.printf("%d + %d = %d\n",num1, num2, num1+num2 );
		System.out.printf("%d - %d = %d\n",num1, num2, num1-num2 );
		
		
		
		
	}
}
