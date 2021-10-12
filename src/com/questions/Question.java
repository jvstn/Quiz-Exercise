package com.questions;

import java.util.ArrayList;

public abstract class Question {
	private String text;
	private ArrayList<String> choices;

	public Question(String text, ArrayList<String> choices) {
		this.text = text;
		this.choices = choices;
	}

	public Question(String text) {
	this.text = text;
	}

	public void displayQuestion() {
		System.out.println(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void displayAnswers() {
		for (int i=0; i<choices.size(); i++) {
			System.out.println(i+ ". " + choices.get(i));
		}
	};

	public ArrayList<String> getChoices() {
		return choices;
	}

	public void setChoices(ArrayList<String> choices) {
		this.choices = choices;
	}

	public abstract int getAnswers();
}
