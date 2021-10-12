package com.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question {
	private ArrayList<Integer> correctAnswers;

	public Checkbox(String text, ArrayList<Integer> correctAnswers, ArrayList<String> choices) {
		super(text, choices);
		this.correctAnswers = correctAnswers;
	}


	public int checkAnswers(ArrayList<Integer> check) {
		int answersCorrect = 0;
		for (int i = 0; i < check.size(); i++) {
			if (correctAnswers.contains(check.get(i))) {
				answersCorrect++;
			}
		}
		if (answersCorrect == correctAnswers.size()) {
			return 1;
		} else {
			return 0;
		}

	}



	public int getAnswers() {
		ArrayList<Integer> usersAnswers = new ArrayList<>();
		System.out.println("There are multiple correct answers. To begin answering the question, enter 'y'.");
		Scanner userContinue = new Scanner(System.in);
		String goingToContinue = userContinue.nextLine();
		while (goingToContinue.indexOf('y') >= 0 && usersAnswers.size() <= getChoices().size()) {
			System.out.println("Type the number next the answer you want");
			Scanner userAnswer = new Scanner(System.in);
			String answer = userAnswer.nextLine();
			int option = Integer.parseInt(answer);
			usersAnswers.add(option);

			System.out.println("There are multiple correct answers. To continue answering the question, enter 'y'.");
			goingToContinue = userContinue.nextLine();
		}
		return checkAnswers(usersAnswers);

	}
}
