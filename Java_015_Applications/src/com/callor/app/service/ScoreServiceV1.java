package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.wjdfbdns.standard.InputService;
import com.wjdfbdns.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	
	List<ScoreVO> scoreList;
	
	public ScoreServiceV1() {
		 scoreList = new ArrayList<ScoreVO>();
	}

	public static void main(String[] args) {
		InputService ssV1 = new InputServiceImplV1();
		
		ssV1.inputValue("국어", 0, 100);
		ssV1.inputValue("영어", 0, 100);
		ssV1.inputValue("수학", 0, 100);
		
		
		
		
		
	}

}
