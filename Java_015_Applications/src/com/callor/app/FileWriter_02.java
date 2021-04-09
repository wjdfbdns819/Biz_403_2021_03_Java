package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter_02 {

	public static void main(String[] args) {
		// txt 파일이 F5를 눌렀을때 생성이 안되는 경우는 
		// Refresh 클릭하면됨
		
		String fileName = "src/com/callor/app/9981.txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			out.println("=".repeat(50));
			out.println("구구단을 외우자");
			out.println("-".repeat(50));
			for(int i = 2 ; i < 10 ; i++) {
				out.printf("%d x %d = %d\n", 7, i, 7 * i);
			}
			out.println("=".repeat(50));
			out.flush();
			out.close();
			System.out.println("완료 집에가자");
		} catch (IOException e) {
			System.out.println("파일을 만들수 없음");
		}
	}
}
