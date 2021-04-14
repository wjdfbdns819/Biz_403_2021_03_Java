package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1 implements WordService {

	List<WordVO> wordList;
	String strEng[];
	String strKor[];

	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
	}

	@Override
	public void loadWord() {

		String fileName = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			String reader = null;
			while (true) {
				reader = buffer.readLine();

				if (reader == null)
					break;

				String[] words = reader.split(":");
				
				

			}

			buffer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord2() {
		// TODO Auto-generated method stub
		
	}

}