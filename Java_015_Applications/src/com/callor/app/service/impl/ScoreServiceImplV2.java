package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

		/* Integer intNum = inService.inputValue("학번", 1);

		if (intNum == null) {
			return;
		}
		
		int [] nums = new int [score];
		for(int i = 0 ; i < nums.length ; i++ ) {
			if(nums[i] == intNum) {
				System.out.println("이미 입력됨");
			}
			
		}
		
		String strNum = String.format("%03d", intNum);

		if(strNum == null ) {
			return;
		} */

		
	/*
	 * scoreList에 성적정보를 추가할때
	 * 	학번을 입력받을텐데 
	 * 	이미 등록된 학번 정보가 있으면 그 학번은 추가하지 못하도록
	 * 	하는 코드를 작성
	 * 
	 * V1의 inputNum() method를 재정의 한다
	 * 	V1 inputNum() method를 재정의하기 위하여
	 * 		private을 protected로 변경했음
	 */

	@Override
	protected String inputNum() {
		while(true) {
			Integer intNum = inService.inputValue("학번", 1);
			if(intNum == null) {
				return null;
			}
			String strNum = String.format("%03d", intNum);
			
			/*
			 * 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인해야함
			 * 
			 */
			
			int index = 0;
			// index 0 ~ scoreList.size() -1 까지 반복하는 과정에서
			// 0 ~ scoreList.size() -1에 해당한 값을 갖게된다
			for(index = 0 ; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);
				if(vo.getNum().equals(strNum)) { 
					break; // => 이미 리스트에 있으면 break; 만나서 끝
				}
			}
			
			// for() 반복문이 모두 정상종료 되었는지? : index >= size()
			// 아니면 중간에 중단되고 빠져나왔는지? : index < size()
			//	for() 중간에 break를 만났다. 
			// 				=> break가 실행되었다 
			//					=> 이미 등록된 학번이 있음 
			
			if(index < scoreList.size()) {
				System.out.println(strNum + "는 이미 등록되어 있음");
				// 다시 입력받으러 가기
				continue;
			}
			return strNum;

		}
				
	}
}
