package main.java.answer;


import java.util.regex.*;
/**
 * Created by Zaki on 01/12/2016.
 */
public class ShitGit implements Answer {
    public boolean matchesWith(String query) {
        if (query.matches("(.*)git(.*)")||query.matches("(.*)bitbucket(.*)")||query.matches("(.*)github(.*)")||query.matches("(.*)git bash(.*)"))
        {
            return true;
        }
        return false;
    }

    public String getAnswer() {
        return "Maybe you'll find a solution on http://ohshitgit.com/";
    }
}
