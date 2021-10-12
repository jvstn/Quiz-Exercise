package com.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Quiz cryptoQuiz = new Quiz(new ArrayList<Question>());
         // Checkbox question
        ArrayList<Integer> possAns = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<String> checkboxChoices = new ArrayList<>(Arrays.asList("Bitcoin", "Ethereum", "Polkadot", "Digimon"));
        Checkbox question1 = new Checkbox("Which of these are considered alt coins?", possAns, checkboxChoices);
        cryptoQuiz.addQuestion(question1);

        // Multiple Choice Question
        ArrayList<String> founderChoices = new ArrayList<String>(Arrays.asList("Satoshi Nakamoto", "Vitalik Buterin", "Abe Lincoln"));
        MultipleChoice question2 = new MultipleChoice("Who founded bitcoin?", 0, founderChoices);
        cryptoQuiz.addQuestion(question2);

        //True False Question
        ArrayList<String> digitalChoices = new ArrayList<>(Arrays.asList("true", "false"));
        TrueFalse question3 = new TrueFalse("Is bitcoin digital currency?", 0, digitalChoices);
        cryptoQuiz.addQuestion(question3);

        // Short Answer Question
        ShortAnswer question4 = new ShortAnswer("What is the crypto version of \"hold\"?", "hodl", 10);
        cryptoQuiz.addQuestion(question4);

        cryptoQuiz.runQuiz();
        cryptoQuiz.gradeQuiz();
    }
}
