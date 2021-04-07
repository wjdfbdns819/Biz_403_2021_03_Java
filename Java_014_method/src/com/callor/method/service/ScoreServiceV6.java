package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.ScoreVO;

public class ScoreServiceV6 {

	String[] subject;
	List<ScoreVO> scoreList;

	InputServiceV2 inService;

	public ScoreServiceV6() {
		subject = new String[] { "국어", "영어", "수학" };
		scoreList = new ArrayList<ScoreVO>();

		inService = new InputServiceV2();
	}

	public void inputScore() {

		for (int i = 0; i < 5; i++) {

			Integer[] score = new Integer[subject.length];

			for (int j = 0; j < subject.length; j++) {
				score[j] = inService.inputValue(subject[j], 0, 100);
			}

			ScoreVO sVO = new ScoreVO();
			sVO.setKor(score[0]);
			
			sVO = new ScoreVO();
			sVO.setEng(score[1]);
			
			sVO = new ScoreVO();
			sVO.setMath(score[2]);
			
			scoreList.add(sVO);
			
		} // for
		
	} // inputScore
	
}
