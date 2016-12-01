package main.java;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

/**
 * Created by user on 01/12/2016.
 */
public class Main {

    static Token tokenList;

    public static void main (String[] args) throws TwitterException{
        tokenList = new Token();
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(tokenList.getConsumerKey())
                .setOAuthConsumerSecret(tokenList.getConsumerSecret())
                .setOAuthAccessToken(tokenList.getAccessToken())
                .setOAuthAccessTokenSecret(tokenList.getAccessTokenSecret());
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        Paging page = new Paging(1);
        List<DirectMessage> directMessages;
        directMessages = twitter.getDirectMessages(page);
        for (DirectMessage message : directMessages) {
            System.out.println("To: @" + message.getRecipientScreenName() + " id:" + message.getId() + " - "
                    + message.getText());
        }
        DirectMessage message = twitter.sendDirectMessage("TanguyInvrnz", "TanguyInvrnz");
        System.out.println("Direct message successfully sent to " + message.getRecipientScreenName());
        System.exit(0);
    }
}