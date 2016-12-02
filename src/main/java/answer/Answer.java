package main.java.answer;

/**
 * Created by user on 01/12/2016.
 */
public interface Answer {

    public boolean matchesWith(String query);

    public String getAnswer(String query);
}
