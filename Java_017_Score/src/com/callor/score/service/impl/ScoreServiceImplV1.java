package com.callor.score.service.impl;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.wjdfbdns.standard.InputService;
import com.wjdfbdns.standard.MenuService;
import com.wjdfbdns.standard.impl.InputServiceImplV1;
import com.wjdfbdns.standard.impl.MenuServiceImplV1;


public class ScoreServiceImplV1 implements ScoreService{
	
	protected Scanner scan;
	protected InputService inService;
	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		
	}
	
	@Override
	public void selectMenu() {
		// TODO 메뉴
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("학생정보 등록");
		scoreMenu.add("성적 등록");
		scoreMenu.add("성적정보 열기");
		scoreMenu.add("성적정보 저장");
		scoreMenu.add("성적정보 출력");
		
		menuService 
			= new MenuServiceImplV1("대한 고등학고 성적처리 시스템 2021", scoreMenu);
		
		while (true) {
			Integer intM = menuService.selectMenu();
			if(intM == null) {
				System.out.println("업무종료");
				return;
			}
			
			if(intM == 1) {
				
			} else if(intM == 2) {
				this.inputScore();
			} else if(intM == 3) {
				this.readScore();
			} else if(intM == 4) {
				this.saveScore();
			} else if(intM == 5) {
				this.printScore();
			}
			
				
		}
		
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	
	

}
