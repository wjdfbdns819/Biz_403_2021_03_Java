package com.liger819.jack.service;

import java.util.ArrayList;
import java.util.List;

import com.liger819.jack.model.DeckVO;

// 똑같은 구조의 두개의 List를 선언

public class PlayerServiceV1 {
	
	// 각 플레이어(딜러포함)가 받은 카드를 저장할 List
	List<DeckVO> myDeckList;
	
	// deck에서 한장씩 플레이어에게 전달할 카드 List
	List<DeckVO> pubDeckList;
	
	String playerName;
	
	// 플레이어 이름을 지정하지 않고 deck만 받은 경우 (딜러)
	public PlayerServiceV1(List<DeckVO> deckList) {
		this(deckList,"딜러");
	}
	
	public PlayerServiceV1(List<DeckVO> deckList, String playName) { 
		// 생성자는 deckList와 playName을 매개변수로 받음
		 
			this.myDeckList = new ArrayList<DeckVO>();
		
		// 매개변수로 받은 deckList를 pubDeckList와 연결
			this.pubDeckList = deckList;
			this.playerName = playName;
			
	
	}
	
	// 자신이 받은 카드의 점수를 계산하는 method
	public int sumValue() {
		
		int sumValue = 0;
		for(DeckVO vo : myDeckList) {
			sumValue += vo.getValue();
					
		}
		return sumValue;
	}
	
	// 각 player들이 hit를 수행할 method 
	public void hit() {
		
		if(this.playerName.equals("딜러") && this.sumValue() > 16) {
			System.out.println("딜러점수 : " + this.sumValue());
			System.out.println("딜러 Hit 금지");
		} else {
			// 받은 카드를 내 카드 리스트에 추가
			myDeckList.add(pubDeckList.get(0)); 
			
			// 받을 카드에서 1번째 한장을 제외시킴
			pubDeckList.remove(0);
			
			// => hit가 실행될때마다 pubDeckList에 한장씩 받아서 myDeckList에 추가하게 됨
		}
		System.out.println("=".repeat(50));
		System.out.println(playerName);
		System.out.println("-".repeat(50));
		
		// 현재 보유중인 카드 리스트를 보여줌
		for(DeckVO vo: myDeckList) {
			System.out.println(vo); 
		}
		System.out.println("-".repeat(50)); 
		System.out.println("현재점수 : " + this.sumValue());
	} 
}
