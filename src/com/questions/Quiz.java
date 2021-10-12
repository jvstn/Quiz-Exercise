package com.questions;

import java.util.ArrayList;

public class Quiz {
	private ArrayList<Question> questions;
	private int score;
	private int total;

	public Quiz(ArrayList<Question> questions) {
		this.questions = questions;
		this.score = 0;
		this.total = questions.size();
	}

	public void addQuestion(Question question) {
		questions.add(question);
		total += 1;
	}

	public void runQuiz() {
		for (int i=0; i<questions.size(); i++) {
			questions.get(i).displayQuestion();
			questions.get(i).displayAnswers();
			int pointValue = questions.get(i).getAnswers();
			this.score += pointValue;
		}
	}

	public void gradeQuiz() {
		System.out.println("You scored " + score + "/" + total + ".");
	}

}
