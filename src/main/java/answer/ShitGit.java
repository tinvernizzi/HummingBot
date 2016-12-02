package main.java.answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 01/12/2016.
 */

public class ShitGit implements Answer {
    public ShitGit() {}

    public boolean matchesWith(String query) {
        if (query.matches("(.*)git(.*)"))
        {
            return true;
        }
        return false;
    }

    public String getAnswer(String query) {
        String res = "You may find what you need at www.ohshitgit.com";
        return res;
    }
}
