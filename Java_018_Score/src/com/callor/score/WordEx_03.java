package com.callor.score;

import com.callor.score.impl.WordServiceImplV3;
import com.callor.score.service.WordService;

public class WordEx_03 {

	public static void main(String[] args) {
		
		WordService wService = new WordServiceImplV3();
		
		wService.selectMenu();
		
		
	}
}
