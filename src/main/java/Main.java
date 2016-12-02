package main.java;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws TwitterException, IOException, JSONException {
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