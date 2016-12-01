package main.java.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 01/12/2016.
 */

public class Joke implements Answer {
    List<String> jokes = new ArrayList<String>();

    public Joke()
    {
        this.jokes.add("What does an IT professional use for birth control? \n" +
                "His personality.");
        this.jokes.add("A customer comes into the computer store. \n" +
                "I'm looking for a mystery Adventure Game with lots of graphics. You know, something really challenging.\" \n" +
                "\"Well,\" replied the clerk, \"Have you tried Vista?\"");
    }

    public boolean matchesWith(String query) {
        query = query.toLowerCase();
        if (query.matches("(.*)JOKE(.*)")||query.matches("(.*)LAUGH(.*)"))
        {
            this.getAnswer();
            return true;
        }
        return false;
    }

    public String getAnswer() {
        Random rnd = new Random();
        int randomNum = rnd.nextInt(this.jokes.size());

        return this.jokes.get(randomNum);
    }
}
