package com.callor.var;

public class variiable_06 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		
		// intNum = intNum + 1
		System.out.println(intNum++);
		System.out.println(intNum++);
		System.out.println(intNum++);
		System.out.println(intNum++);

		intNum = 0;
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
		System.out.println(++intNum);
	
		intNum = 0;
		// 1
		intNum += 1;
		System.out.println(intNum);
		
		// 18과 19 명령문을 한 명령문으로 만들면
		System.out.println(++intNum);
		
		
		// 2
		System.out.println(intNum);
		intNum += 1;

		// 26번과 27번을 한 명령문을 만들면
		System.out.println(intNum ++);
		
		
	}

}