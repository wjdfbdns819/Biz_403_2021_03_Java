package com.callor.apps;

import java.util.Random;

public class App_01 {
	/*
	 * 25 ~ 50명 인원이 있는 각 반에 pizza 간식을 지급하려고 한다
	 * 각 반의 학생들에게 1 조각씩 pizza를 지급하려고 한다 학생수보다 부족하거나 6조각 이상 남지 않도록 pizza를 주문해야한다 
	 * 몇 box의 pizza를 주문해야 하는지 코드 구현ㄴ*/
	public static void main(String[] args) {
		
		Random rnd = new Random ();
		rnd.nextInt(); // -2^^31 ~ 2^^31 -1 중의 수
		
		rnd.nextInt(10); // 0 ~(10 - 1), +1(1~10)
		
		// 조각수
		int pizzaPcs = 6;
		// 25 ~ 50의 수 중에서 1개를 만들어라
		int intMembers = rnd.nextInt(26) + 25; //
		
		int pizzaBox = 0;
		// 정수 / 정수 => 몫이 몇개인가
		// 필요한 box 수와 같거나 1 작은 값이 만들어짐
		
		pizzaBox = intMembers / pizzaPcs;
		boolean bYes = intMembers % (pizzaBox * pizzaPcs) == 0;
		
		//if(bYes == false) { }
		if(!bYes) {pizzaBox++;}
		
		
		
	}
}
