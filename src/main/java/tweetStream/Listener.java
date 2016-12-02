package main.java.tweetStream;

import main.java.answer.*;
import twitter4j.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Listener {

    private ArrayList<Answer> answerList;

    public void startListening(Twitter twitter, DirectMessage prevMessage) throws TwitterException, IOException, JSONException, InterruptedException {
        answerList = new ArrayList<Answer>();
        this.addAllAnswers(answerList);
        long start = System.currentTimeMillis();

        while (true) {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Map<String , RateLimitStatus> rateLimitStatus = twitter.getRateLimitStatus();
            RateLimitStatus status = rateLimitStatus.get("/application/rate_limit_status");
            System.out.println(" Limit: " + status.getLimit());
            System.out.println(" Remaining: " + status.getRemaining());
            System.out.println(" ResetTimeInSeconds: " + status.getResetTimeInSeconds());
            System.out.println(" SecondsUntilReset: " + status.getSecondsUntilReset() + "\n");

            if(status.getLimit() == 1)
            {
                Thread.sleep(300000);
                Twitter stopTweet = TwitterFactory.getSingleton();
                Status stat = stopTweet.updateStatus("Requests are on hold for 5 minutes");

            }

            DirectMessage message = twitter.getDirectMessages().get(0);
            System.out.println(message.getText());
            String answer = "I did not understand your question";
            if (prevMessage == null || !message.equals(prevMessage)) {
                for (int i = 0; i < answerList.size(); i++) {
                    if (answerList.get(i).matchesWith(message.getText().toLowerCase())) {
                        answer = answerList.get(i).getAnswer();
                        break;
                    }
                }
                twitter.sendDirectMessage(message.getSenderId(), answer);
                System.out.println("Sent: " + answer + " to @" + message.getRecipientScreenName());
                prevMessage = message;
            }
        }
    }

    private void addAllAnswers(ArrayList<Answer> answerList) {
        answerList.add(new ShitGit());
        answerList.add(new Joke());
        answerList.add(new Abilities());
        answerList.add(new Presentation());
        answerList.add(new whatIs());
    }
}
