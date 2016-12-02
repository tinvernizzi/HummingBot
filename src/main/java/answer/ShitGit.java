package main.java.answer;


import java.util.regex.*;
/**
 * Created by Zaki on 01/12/2016.
 */
public class ShitGit implements Answer {

    private static Pattern pattern;
    private static Matcher matcher;

    public boolean matchesWith(String query) {
        pattern = Pattern.compile("( git ) (bitbucket) (github) (git bash)");
        matcher = pattern.matcher(query);
        while(matcher.find()) {
           return true;
        }
        return false;
    }

    public String getAnswer() {
        return "Maybe you'll find a solution on http://ohshitgit.com/";
    }
}
