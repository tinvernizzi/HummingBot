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
        Listener listener = new Listener();
        listener.startListening(twitter, prevMessage);
        System.out.println("Goodbye");
    }
}