package com.callor.reload.service;
/* flag 변수 생략 */
public class PrimeServiceV3 extends PrimeServiceV1{
	
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;
		
		//for() 반복문이 중단되었느냐( = break를 만났느냐)
		//	아니면 모두 수행했느냐
		int index = 0;
		for (index = 2 ; index < rndNum ; index++) {
			if(rndNum % index == 0) {
				break;
			}
		}
		// for() 끝났을때 break 되었을때와 
		//	그렇지 않은 경우를 확인하여 코드를 진행해야함
		
		// 코드가 break 되었을때는 항상 index <  rndNum임
		// 그렇지 않은 경우는 index == rndNum 가 된다
		if(index < rndNum) {
			System.out.println(rndNum + "는 소수가 아님");
		} else { 
			System.out.println(rndNum + "는 소수임");
		}
		
	}

}
