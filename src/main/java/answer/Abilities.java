package main.java.answer;

import java.util.regex.*;

/**
 * Created by Zaki on 01/12/2016.
 */
public class Abilities {
    public boolean matchesWith(String query) {
        query.toLowerCase();

        if (query.matches("(.*)what can you do(.*)")||query.matches("(.*)what are you capable of(.*)")||query.matches("(.*)what are you features(.*)"))
        {
            return true;
        }
        return false;
    }

    public String getAnswer() {
        return "Well, I can answer your questions, or tell you some jokes (believe me, they are amazing), I can present myself or give you some help with git.";
    }
}
