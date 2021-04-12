package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {

	public static void main(String[] args) {
		Random rnd = new Random();
		String fileName = "src/com/callor/app/data.txt";

		FileWriter fileWriter = null;
		PrintWriter out = null;

		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);

			out.println("=".repeat(50));
			out.println("사칙연산");
			out.println("-".repeat(50));

			int num1 = rnd.nextInt(100) + 1;
			int num2 = rnd.nextInt(100) + 1;

			out.printf("%d + %d = %d\n", num1, num2, num1 + num2);

			if (num1 > num2) {
				out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			} else {
				out.printf("%d - %d = %d\n", num2, num1, num2 - num1);
			}

			out.printf("%d * %d = %d\n", num1, num2, num1 * num2);

			if (num1 > num2) {
				out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			} else {
				out.printf("%d / %d = %d\n", num2, num1, num2 / num1);
			}

			out.println("-".repeat(50));
			out.flush();
			out.close();

		} catch (IOException e) {

			System.out.println("종료");
		}

	}
}
