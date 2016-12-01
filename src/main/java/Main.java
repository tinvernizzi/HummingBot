package main.java;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by user on 01/12/2016.
 */
public class Main {

    static Token tokenList;
    Twitter twitter;

    public static void main (String[] args) throws TwitterException {
        tokenList = new Token();
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(tokenList.getConsumerKey())
                .setOAuthConsumerSecret(tokenList.getConsumerSecret())
                .setOAuthAccessToken(tokenList.getAccessToken())
                .setOAuthAccessTokenSecret(tokenList.getAccessTokenSecret());
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        Status status = twitter.updateStatus("test");
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
    }
}