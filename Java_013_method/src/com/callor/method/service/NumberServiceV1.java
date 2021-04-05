package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1 {
	/*
	 * Random 수를 생성하여 3의 배수이면 그 수를 아니면 null을 return
	 * 		==> 반드시 어떤 값을 return 하라는 뜻임
	 * 대표값으로 어떤 type의 값을 return 할 것인가
	 * 	생성한 수가 1 ~ 100까지 정수형 난수
	 * 	3의 배수이면서 정수인 값을 return 하라
	 * 	즉 정수형 3의 배수를 return하라는 의미임
	 * 
	 * return type 을 void가 아닌 정수형 type으로 지정해야 한다
	 * 		정수형 type에는 int 와 Integer가 있다
	 * 
	 * return의 두번째 조건에 "아니면 null 값을 return"하라는 
	 * 		지시가 있으므므로 int 형은 사용할수 없다
	 * 
	 * void 키워드 method에 return 명령이 꼭 없어도 되는 경우임
	 */
	
	/*
	 * 이 method는 정수형 3의 배수 또는 null 값을 return 해야 하기 때문에
	 * 	Integer 형 return type을 설정해야 한다
	 *  void 대신 Integer를 사용한다
	 *  
	 *  void 대신 Integer를 사용하면 반드시 return 명령문과 return할 값(대상)이 코드에 있어야 한다
	 *  	아직 method에 return문이 없기때문에 오류가 발생
	 *  
	 *  method에 오류가 나는 것을 없애기 위해 return문을 추가한다
	 *  이 method는 return 명령문만으로 처리가 되지 않고
	 *  	반드시 return 할 값(대상)이 있어야 한다
	 *  
	 *  primitive type 중에 숫자형인 경우는 0을
	 *  wrapper 클래스 type을 사용하는 경우는 null을 보통 사용한다
	 */
	public Integer inputNum() {
		Random rnd = new Random();
		
		Integer num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		
		if(num1 % 3 == 0) {
			return num1;
		} 
		
		if(num2 % 3 == 0) {
			/*
			 * 현재 inputNum() method의 return type은 Integer 형 이다
			 * 그런데 여기에서 return하는 num2변수의 type은 int 형 이다
			 * 별다른 문제를 일으키거나 하지는 않지만 실제 코드가 작동될때는
			 * 	int 형을 Integer wrapper 클래스형으로 변환하는 과정이 일어난다
			 * 
			 */
			return num2; // 내부에서 int num2 값이 Integer 형으로 변환하는 과정이 일어남
		}
		return null;
		
	}
	
	
	
	
	
	
	/* x
	public void inputNum() {
		
		int intNum = rnd.nextInt(100) + 1;
		
		for(int i = 0; i < intNum; i++ ) {
			if(intNum % 3 == 0) { System.out.println(intNum + "3의 배수임");
				
			} else if(intNum % 2 == 0) {
				System.out.println(intNum + "3의 배수 아님");
				return;
			}
		}
	} // inputNum */
}