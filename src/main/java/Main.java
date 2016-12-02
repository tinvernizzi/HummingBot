package main.java;

import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


public class Main {

    public static void main(String[] args) throws TwitterException {
        Token tokenList = new Token();
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(tokenList.getConsumerKey())
                .setOAuthConsumerSecret(tokenList.getConsumerSecret())
                .setOAuthAccessToken(tokenList.getAccessToken())
                .setOAuthAccessTokenSecret(tokenList.getAccessTokenSecret());
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        DirectMessage prevMessage = twitter.getDirectMessages().get(0);
        long start = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            DirectMessage message = twitter.getDirectMessages().get(0);
            System.out.println(message.getText());
            DirectMessage answer;
            if (prevMessage == null || !message.equals(prevMessage)) {
                if (message.getText().equals("Josué est-il gay?")) {
                    answer = twitter.sendDirectMessage(message.getSenderId(), "Oui il gobe d'énormes teubis");
                }
                else {
                    answer = twitter.sendDirectMessage(message.getSenderId(), "mamène");
                }
                System.out.println("Sent: " + answer.getText() + " to @" + message.getRecipientScreenName());
                prevMessage = message;
                start = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - start > 30000) break;
        }
        System.out.println("Goodbye");
    }
}