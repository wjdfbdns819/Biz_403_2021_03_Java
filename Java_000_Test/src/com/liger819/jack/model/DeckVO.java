package com.liger819.jack.model;
/*
 * [플레잉 카드] 
 * 한세트에 52개의 카드(조커 제외)가 들어있음
 * 
 * suit : 빨강(다이아몬드◆, 하트♥) , 검정(스페이드♠, 클로버♣)
 * 
 * denomination(끝수) -> 13가지 종류로 되어있음
 *  숫자 : 2 ~ 10  / 알파벳 : K(king), Q(Queen), J(Jack), A(Ace)
 */
public class DeckVO {

	private String suit;
	private String denomination; 
	private int value; // => 각각의 카드들이 갖는 실제 값을 Value 변수에 저장
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "[suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	
}
