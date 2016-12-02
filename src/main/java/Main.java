package main.java;


import main.java.wikiQuery.wikiQuery;
import twitter4j.JSONException;
import twitter4j.TwitterException;

import java.io.IOException;

/**
 * Created by user on 01/12/2016.
 */
public class Main {

    static Token tokenList;

    public static void main (String[] args) throws TwitterException, JSONException, IOException {
        wikiQuery wiki = new wikiQuery();
        wiki.makeAQuery("frustration");
    }
}