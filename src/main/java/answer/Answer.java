package main.java.answer;

import twitter4j.JSONException;

import java.io.IOException;

/**
 * Created by user on 01/12/2016.
 */
public interface Answer {

    public boolean matchesWith(String query);

    public String getAnswer() throws IOException, JSONException;
}
