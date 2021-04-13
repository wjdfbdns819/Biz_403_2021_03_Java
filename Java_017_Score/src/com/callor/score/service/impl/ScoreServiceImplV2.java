package com.callor.score.service.impl;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected String [] subjectList;
	protected Integer [] subScore;
	
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2; // 배열의 index값을 쉽게 쓰기 위해서 사용
	
	public ScoreServiceImplV2() {
		subjectList = new String [] {"국어", "영어", "수학"};
		
		subScore = new Integer [subjectList.length]; // 과목점수를 담을 배열
	}
	
	@Override
	public void inputScore() {

		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return; 
		} 
		
		// 학번이 중복인 경우
		
		//
			
		String strNum = String.format("%03d", intNum); // 학번
		
		String strName = null;
		while (true) {
			System.out.println(strNum + "학생 이름을 입력");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				System.out.println("입력 중단");
				return;
				} 
				if (strName.equals("")) {
					System.out.println("학생이름은 반드시 입력");
					continue;
				}
				break;
			} // end while , 학생이름
		
		// 배열 사용 (3과목 성적 입력)
				for(int i = 0 ; i < subjectList.length ; i++) {
					String subject = subjectList[i] + "점수";
					Integer intScore = inService.inputValue(subject, 0, 100);
					if(intScore == null) {
						return;
					}
					subScore[i] = intScore;
					
					//subScore[i] = inService.inputValue(subjectList[i], 0, 100);
					//if(subScore[i] == null) {
						//return;
				} // 

				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setNum(strNum);
				scoreVO.setName(strName);
				scoreVO.setKor(subScore[국어]);
				scoreVO.setEng(subScore[영어]);
				scoreVO.setMath(subScore[수학]);
				
				// 디버깅
				/* System.out.println("=".repeat(50));
				System.out.println(scoreVO.toString());
				System.out.println("-".repeat(50)); */ 
				
				scoreList.add(scoreVO); // List에 학번, 학생이름, 3과목 성적 추가
	}

	@Override
	public void printScore() {
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		int nSize = scoreList.size();
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t" );
			System.out.print(vo.getName() + "\t" );
			System.out.print(vo.getKor() + "\t" );
			System.out.print(vo.getEng() + "\t" );
			System.out.print(vo.getMath() + "\t" );
			System.out.print(vo.getTotal() + "\t" );
			System.out.print(vo.getAvg() + "\n" );
		}
		System.out.println("=".repeat(80));
	}

	@Override
	public void saveScore() {
		
		String fileName = null;
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요");
			System.out.print(">> ");
			fileName = scan.nextLine();
			if(fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력");
				continue;
			}
			break;
		}
		
		String strFileName = "src/com/callor/score/" + fileName; 
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i = 0 ; i < nSize ; i++ ) {
				ScoreVO vo = scoreList.get(i);
				
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n", vo.getAvg() );
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("종료");
		}
		
	}
}
