package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {

	public static void main(String[] args) {
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.makeKor();
		ssV1.makeEng();
		ssV1.makeMath();
	

	}
}
