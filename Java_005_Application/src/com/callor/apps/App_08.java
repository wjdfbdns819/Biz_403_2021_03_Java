package com.callor.apps;

import java.text.DecimalFormat;

public class App_08 {

	public static void main(String[] args) {
		
		int intNum = 3939239;
		DecimalFormat strForm = new DecimalFormat("###,###"); // 숫자를 3자리마다 컴마(,)
		
		// format(숫자) 명령을 수행하면 숫자를 3자리 구분기호를 부착하여 
		// 	문자열로 만들어준다.
		String str = strForm.format(intNum);
		
		System.out.println(str); // 변수에 담기
		
		System.out.println(strForm.format(32131231)); // 출력
				
		
		
	}
}
