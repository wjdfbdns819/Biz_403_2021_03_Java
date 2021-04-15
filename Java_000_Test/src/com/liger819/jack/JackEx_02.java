package com.liger819.jack;

import java.util.List;

import com.liger819.jack.model.DeckVO;
import com.liger819.jack.service.DeckServiceV1;
import com.liger819.jack.service.PlayerServiceV1;

public class JackEx_02 {

	public static void main(String[] args) {
		
		DeckServiceV1 ds = new DeckServiceV1();
		
		
		ds.makeDeck(); // 카드를 만들어서 만든값 추출해오기
		
		List<DeckVO> deckList = ds.getDeck();
		
		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		PlayerServiceV1 유저 = new PlayerServiceV1(deckList, "유저");
		
		딜러.hit();
		유저.hit();
		
		딜러.hit();
		유저.hit();
		
		if(딜러.sumValue() < 17) 딜러.hit();
		유저.hit();
		 
		// 반복문으로 묶어야 될것같음
	}
}
