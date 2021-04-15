package com.liger819.jack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.liger819.jack.model.DeckVO;

/*
 * 게임에서 사용할 1벌의 게임카드를 생성할 부분임
 */
public class DeckServiceV1 {

	// 생성된 1벌의 카드를 List에 저장
	List <DeckVO> deckList;
	
	// 스플릿 사용??
	String suit ="다이아몬드(◆):하트(♥):스페이드(♠):클로버(♣)"; 
	// => (:)으로 구성된 4개의 문자열
		// => 배열을 사용하여 만들수 있을것 같음
	
	// 배열 사용
	String [] strSuit 
		= new String [] {"다이아몬드(◆)", "하트(♥)", "스페이드(♠)", "클로버(♣)"};
	
	String denomination = "A234567890KQJ"; // => 끝수에 해당하는 2 ~ 9,0 / A ~ J 
	
	public DeckServiceV1() { // 생성자 만듦
		
		this.deckList = new LinkedList<DeckVO>(); // ArrayList를 써도 크게 문제는 없음
	}
	
		// List를 만들어서 외부에 가져갈수있도록 method를 구현
		//List에 DeckVO를 담고있는 형식으로 만들었음
	public List<DeckVO> getDeck() {
		
		// 셔플까지 해서 deckList로 보냄
		int nSize = deckList.size();
		for(int i = 0 ; i < nSize ; i++) {
			Collections.shuffle(this.deckList );
		} // => deckList에 든 카드수 만큼 셔플? 
		
		for(DeckVO vo : deckList) {
			Collections.shuffle(this.deckList );
		}
 		return this.deckList; 
	}
	
		// 덱을 만드는 method 구현
	public void makeDeck() {
		String [] denoms = denomination.split(""); // => 알파벳 단위로 쪼개고 denoms 배열에 저장
		for(String suit : strSuit) {
			for(String denom : denoms) { 
				// => String형 반복문이긴한데 valueOf써서 정수형으로 바꿀수 있나 고민  
				
				// 각 카드가 갖게될 value 값을 생성
				// value 값은 denoms를 기준으로 생성함
				// 2 ~ 9까지는 보이는 값 그대로 사용  
				// 	A는 1로 / K,Q,J는 10으로 변환하여 사용
				
				int intValue = 0;
				
				// intValue = Integer.valueOf(denom); 
					// => 끝수들을 하나씩 쪼개서 정수로 바꿈
					// => 그러나 A,K,Q,J를 정수로 바꿀때 오류가 발생 => try문 사용 
				
 				try {
 					// 숫자 2 ~ 9, 0까지는 각 값들이 정수로 정상 변환됨
 					// 	A,K,Q,J는 Exception이 발생함 
 					//	=> Exception이 발생하면 catch 다음 문장이 실행될것임
					intValue = Integer.valueOf(denom);
					
					// donoms에 저장된 끝수 10은 10이 아니라 0으로 저장되어 있어서 바꿔야함
					// intValue 값을 정상적으로 수행을 끝내면 0을 10으로 바꾸는 과정 실행
					if(intValue == 0) intValue = 10; 
					
				} catch (Exception e) {
					if(denom.equals("A")) intValue = 1;
					
					else intValue = 10; // => K,Q,K인 경우
				} 
				
 				// DeckVO를 열어서 dVO 생성
				DeckVO dVO = new DeckVO();
				dVO.setSuit(suit); // => suit에 담긴 값을 저장
				dVO.setDenomination(denom); // => denom에 담긴 값을  저장
				dVO.setValue(intValue); // => intValue에 담긴 값을 저장
				
				// 리스트에 추가
				deckList.add(dVO);
			}
		}
	}
}
