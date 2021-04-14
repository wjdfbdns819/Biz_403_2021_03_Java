package com.callor.score;

import com.callor.score.impl.WordServiceImplV1;
import com.callor.score.service.WordService;

public class WordEx_01 {

	public static void main(String[] args) {
		
		WordService wsV1 = new WordServiceImplV1();
		
		wsV1.loadWord();
	}
}
