package com.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {
	private int correctAnswer;


	public MultipleChoice(String text, int correctAnswer, ArrayList<String> choices) {
		super(text, choices);
		this.correctAnswer = correctAnswer;
	}



	@Override
	public int getAnswers() {
		Scanner sysIn = new Scanner(System.in);
		int answer = sysIn.nextInt();
		if (answer == correctAnswer) {
			return 1;
		} else {
			return 0;
		}
	}

}
