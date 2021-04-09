package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2;

public class Score_01 {
	public static void main(String[] args) {
		
		ScoreService ssV1 = new ScoreServiceImplV2();
		
		
		ssV1.selectMenu();
		ssV1.inputScore();
		ssV1.inputName();
		
		
	}
}
