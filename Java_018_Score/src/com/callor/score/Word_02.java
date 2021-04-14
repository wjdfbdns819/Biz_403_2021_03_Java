package com.callor.score;

import com.callor.score.impl.WordSerivceImplV2;
import com.callor.score.service.WordService;

public class Word_02 {

	public static void main(String[] args) {
		
		WordService wSerivce = new WordSerivceImplV2();
		wSerivce.selectMenu();
	}
}
