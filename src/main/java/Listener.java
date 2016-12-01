package main.java;

import main.java.answer.Answer;
import main.java.answer.Joke;

import java.util.ArrayList;

public class Listener {

    private ArrayList<Answer> answerList;

    public void startListening() {
        answerList = new ArrayList<Answer>();
        this.addAllAnswers(answerList);
        /* insert here the code that is looping infinitely

        for (int i = 0; i < answerList.size(); i++) {
            if (answerList.get(i).matchesWith(query))
                answerList.get(i).getAnswer();
                break;
        }
        */
    }

    private void addAllAnswers(ArrayList<Answer> answerList) {
        answerList.add(new Joke());
    }
}
