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
        this.jokes.add("https://pbs.twimg.com/media/CyWYU08W8AEmjzx.jpg");
        this.jokes.add("Why is the sky blue?\n" +
                "Because if it was green you wouldn’t know where to stop mowing.");
        this.jokes.add("What do Donald Trump and a Pumpkin have in common?\n" + "They’re orange on the outside, hollow on the inside, and responsible people will throw them away in early November.\n");
        this.jokes.add("Why don't some couples go to the gym? Because some relationships don't work out.");
        this.jokes.add("Did you hear about the guy who got hit in the head with a can of soda? He was lucky it was a soft drink.");
        this.jokes.add("If there was someone selling drugs in this place, weed know.");
        this.jokes.add("If you pay 25 cents to watch a bad football game don't expect your quarterback.");
        this.jokes.add("I used to be a banker but I lost interest");
        this.jokes.add("A prisoner's favorite punctuation mark is the period. It marks the end of his sentence.");
    }

    public boolean matchesWith(String query) {
        if (query.matches("(.*)joke(.*)")||query.matches("(.*)laugh(.*)"))
        {
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
