package com.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueFalse extends Question {
	private int correctAnswer;

	public TrueFalse(String text, int correctAnswer, ArrayList<String> choices) {
		super(text, choices);
		this.correctAnswer = correctAnswer;
	}




	@Override
	public int getAnswers() {
		Scanner sysIn = new Scanner(System.in);
		System.out.println("Type 0 for true or 1 for false");
		int userAnswer = sysIn.nextInt();
		if (userAnswer == correctAnswer) {
			return 1;
		} else {
			return 0;
		}
	}
}
