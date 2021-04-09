package com.callor.app.service.impl;

import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.wjdfbdns.standard.InputService;
import com.wjdfbdns.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	// 학번, 점수를 입력받을때 사용할 객체
	protected InputService inService; // => 이미 만들어둔 inputValue를 사용하여 처리할수 있음

	// 저장소
	protected List<ScoreVO> scoreList;

	// 학생 이름을 입력받을때 사용할 객체
	protected Scanner scan;

	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO 성적처리 메뉴 선택

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("1번 :리스트 추가");
			System.out.println("2번 : 리스트 출력");
			System.out.println("QUIT: 업무종료");
			System.out.print(">> ");
			String strMenu = scan.nextLine();

			if (strMenu.equals("QUIT")) {
				break;
				// System.out.println("업무종료");
				// return;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strMenu);
			} catch (NumberFormatException e) {
				System.out.println("메뉴는 정수 또는 QUIT만 입력");
			}
			if (intM == 1) {
				this.inputScore();
			} else if (intM == 2) {
				this.printScore();
			}
			
		} // while end
		System.out.println("업무종료");
	}

	@Override
	public String inputName() {
		// TODO
		this.inputName("무명");

		return null;
	}
	/*
	 * int [] intNum = new int[5];
	 * 
	 * for(int i = 0 ; i < intNum.length ; i++ ) { System.out.println(i);
	 * System.out.printf("학번 입력"); System.out.print(">> "); String num =
	 * scan.nextLine(); System.out.printf("0%s번의 이름 입력", num);
	 * System.out.print(">> "); String name = scan.nextLine(); this.inputScore();
	 * 
	 * ScoreVO sVO = new ScoreVO(); sVO.setNum(num); sVO.setName(name);
	 * 
	 * scoreList.add(sVO);
	 * 
	 * } System.out.println(scoreList);
	 */
	
	/*
	 * 현재 클래스 내부에서만 호출되는 method private으로 선언
	 * 현재 클래스를 상속받아 확장하여 사용할수 있도록 하려면
	 * 	private => protected로 변경 해주는것이 좋다
	 */

	protected String inputNum() {

		// 학번입력처리 : 001, 002 형식으로 입력받음
		// 정수 1 이상을 입력하면
		// 정수 값이 intNum에 담길것이고,
		// QUIT를 입력했으면
		// null 값이 intNum에 담길것이다

		Integer intNum = inService.inputValue("학번", 1);

		// intNum에 null 값이 담겨있으면 종료하고 다시 메뉴로 돌아간다
		if (intNum == null) {
			return null;
		}

		// 정수를 입력햇으면 입력받은 정수값을
		// 학번의 문자열 형식(001, 002)을 변환
		// String.format("%3d", 1) :
		// 전체 자릿수를 3개로 만들고,
		// 정수 값을 오른쪽 정렬하는 문자열 만들기
		// " 1"
		// String.format("%03d", 1):
		// 전체 자릿수를 3개로 만들고
		// 정수값을 오른쪽 정렬하고
		// 왼쪽 빈칸에 0을 채워라
		// "001"

		String strNum = String.format("%03d", intNum);
		
		return strNum;
	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		// inputValue 활용함
		
		String strNum =this.inputNum();
		if(strNum == null ) {
			return;
		}

		// 학생의 이름입력
		String strName = this.inputName(strNum);
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}

		Integer intEng = inService.inputValue("수학", 0, 100);
		if (intEng == null) {
			return;
		}

		Integer intMath = inService.inputValue("영어", 0, 100);
		if (intMath == null) {
			return;
		}

		/*
		 * 아래 비교문은 3과목을 모두 입력하는 Prompt가 나타난 후 한 과목이라도 QUIT하면 종료하는 코드이다 만약 국어과목에서 QUIT를
		 * 하여도 영어, 수학 점수를 입력받는 Prompt가 나타나고, 3과목을 모두 통과한 후에 입력이 종료됨
		 */
		// 모아서 한꺼번에 처리할경우
		/*
		 * if(intKor == null || intEng == null || intMath == null) { return; }
		 */

		// 입력을 모두 마쳤으면 VO에 담기
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);

		// VO에 담긴 데이터를 List 저장소에 추가
		scoreList.add(scoreVO);

	}

	private String inputName(String strNum) {
		// TODO 학번을 보여주고, 이름을 입력받는 method
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT: 입력취소)");
			System.out.print(">> ");
			String strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				break; // => 끝에있는 return null을 사용할려할때
				// return null;
			} else if (strName.equals("")) { // 입력 없이 Enter만 입력
				System.out.println("학생이름은 반드시 입력해야함");
				continue;
			}
			return strName;

		} // while end
		return null;
	}

	/*
	 * System.out.println("국어점수 입력"); System.out.print(">> "); String strKor =
	 * scan.nextLine(); Integer kor = Integer.valueOf(strKor);
	 * 
	 * System.out.println("영어점수 입력"); System.out.print(">> "); String strEng =
	 * scan.nextLine(); Integer eng = Integer.valueOf(strKor);
	 * 
	 * System.out.println("수학점수 입력"); System.out.print(">> "); String strMath =
	 * scan.nextLine(); Integer math = Integer.valueOf(strKor);
	 * 
	 * ScoreVO sVO = new ScoreVO(); 
	 * sVO.setKor(kor); 
	 * sVO.setEng(eng);
	 * sVO.setMath(math);
	 */

	@Override
	public void printScore() {
		// TODO 리스트 출력하기
		
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		for(int index = 0 ; index < scoreList.size() ; index++) {
			
			// System.out.println(scoreList.get(index).getNum()); 를 사용하면
			// 	코드가 길어지기때문에 아래와 같은 코드를 사용함
			ScoreVO vo = scoreList.get(index);  
			
			System.out.println(vo.getNum() + "\t");
			System.out.println(vo.getName() + "\t");
			System.out.println(vo.getKor() + "\t");
			System.out.println(vo.getEng() + "\t");
			System.out.println(vo.getMath() + "\t");
			System.out.println(vo.getTotal() + "\t");
			System.out.println(vo.getAvg() + "\t");
			System.out.println("=".repeat(80));
		}

	}

}
