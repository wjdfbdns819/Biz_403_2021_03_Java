package com.liger819.jack;

import java.util.List;

import com.liger819.jack.model.DeckVO;
import com.liger819.jack.service.DeckServiceV1;

// deckList에 값이 담겼는지 test하는 method
public class JackEx_01 {
	public static void main(String[] args) {
		
		DeckServiceV1 deck  = new DeckServiceV1();
		
		deck.makeDeck();
		List<DeckVO> deckList = deck.getDeck(); 
		for(DeckVO vo : deckList) {
			System.out.println(vo); 
		}
		// => 출력했을 때 [suit=다이아몬드(◆), denomination=8, value=8]으로 나오긴 하나
		// 확실하게 52개인지 확인하기 위해서 
		//	001 [suit=다이아몬드(◆), denomination=8, value=8] 처럼 앞에 번호를 붙이는 것도 좋을듯함
	}
}
