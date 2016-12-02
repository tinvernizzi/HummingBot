package main.java;

import main.java.answer.Answer;
import main.java.answer.Joke;
import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.ArrayList;

public class Listener {

    private ArrayList<Answer> answerList;

    public void startListening(Twitter twitter, DirectMessage prevMessage) throws TwitterException {
        answerList = new ArrayList<Answer>();
        this.addAllAnswers(answerList);
        long start = System.currentTimeMillis();

        while (true) {
            try {
                Thread.sleep(14000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            DirectMessage message = twitter.getDirectMessages().get(0);
            System.out.println(message.getText());
            String answer = "I did not understand your question";
            if (prevMessage == null || !message.equals(prevMessage)) {
                for (int i = 0; i < answerList.size(); i++) {
                    if (answerList.get(i).matchesWith(message.getText().toLowerCase()))
                        answer = answerList.get(i).getAnswer();
                    break;
                }
                twitter.sendDirectMessage(message.getSenderId(), answer);
                System.out.println("Sent: " + answer + " to @" + message.getRecipientScreenName());
                prevMessage = message;
            }
        }
    }

    private void addAllAnswers(ArrayList<Answer> answerList) {
        answerList.add(new Joke());
    }
}
