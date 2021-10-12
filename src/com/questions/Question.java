package com.questions;

import java.util.ArrayList;

public abstract class Question {
	private String text;
	private ArrayList<String> choices;


	public Question(String text, ArrayList<String> choices) {
		this.text = text;
		this.choices = choices;
	}

	// Overloaded constructor for short answer
	public Question(String text) {
	this.text = text;
	}

	public void displayQuestion() {
		System.out.println(text);
	}


	public void displayAnswers() {
		for (int i=0; i<choices.size(); i++) {
			System.out.println(i+ ". " + choices.get(i));
		}
	};

	public ArrayList<String> getChoices() {
		return choices;
	}


	public abstract int getAnswers();
}
