package com.questions;

import java.util.Scanner;

public class ShortAnswer extends Question{
	private int maxCharacters;
	private String correctAnswer;
	public ShortAnswer(String text, String correctAnswer, int maxCharacters) {
		super(text);
		this.maxCharacters = maxCharacters;
		this.correctAnswer = correctAnswer;
	}

	@Override
	public void displayAnswers() {
		System.out.println("Type your answer below. Max characters: " + maxCharacters);
	}

	@Override
	public int getAnswers() {
		Scanner sysIn = new Scanner(System.in);
		String userAnswer = sysIn.nextLine();
		if (userAnswer.length() > maxCharacters) {
			System.out.println("Answer exceeds max amount. Please try again");
			getAnswers();
		}
		if (userAnswer.toLowerCase().equals(correctAnswer.toLowerCase())) {
			return 1;
		} else {
			return 0;
		}
	}


}
