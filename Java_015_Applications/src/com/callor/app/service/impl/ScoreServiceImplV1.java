package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	private List<ScoreVO> scoreList;
	private Scanner scan;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO 메뉴 1번 추가 2번 리스트 출력
		System.out.println("=".repeat(50));

		while (true) {
			System.out.println("1번 :리스트 추가, 2번: 리스트 출력");
			System.out.print(">> ");
			String strMenu = scan.nextLine();
			Integer intMenu = Integer.valueOf(strMenu);
			if (intMenu == 1) {
				this.inputName();
			} else if (intMenu == 2) {
				this.printScore();
				break;
			}
			System.out.println("-".repeat(50));
		}

	}

	@Override
	public String inputName() {
		// TODO 학번 이름
		this.selectMenu();
		
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.printf("학번 입력");
			System.out.print(">> ");
			String num = scan.nextLine();
			System.out.printf("%s번의 이름 입력", num);
			System.out.print(">> ");
			String name = scan.nextLine();

			ScoreVO sVO = new ScoreVO();
			sVO.setNum(num);
			sVO.setName(name);
		}
		return null;


			
			
		
	}

	@Override
	public void inputScore() {
		// TODO 성적
		
			this.inputName();
			System.out.println("국어점수 입력");
			System.out.print(">> ");
			Integer kor = scan.nextInt();

			System.out.println("영어점수 입력");
			System.out.print(">> ");
			Integer eng = scan.nextInt();

			System.out.println("수학점수 입력");
			System.out.print(">> ");
			Integer math = scan.nextInt();

			ScoreVO sVO = new ScoreVO();
			sVO.setKor(kor);
			sVO.setEng(eng);
			sVO.setMath(math);

			scoreList.add(sVO);
			
		
	}

	@Override
	public void printScore() {
		// TODO 출력
		

	}

}
