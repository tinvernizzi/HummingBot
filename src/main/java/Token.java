package main.java;

public class Token {

    private String ConsumerKey;

    private String ConsumerSecret;

    private String AccessToken;

    private String AccessTokenSecret;    public Token() {

        ConsumerKey = "nkyoDXrZqQx2GfDtY8nlHSwu1";

        ConsumerSecret = "oZHMicXPzusGuI0qh3co3PjOxpW5nbwdgVpG1COE95QqeBXds1";

        AccessToken = "804391145224753153-xKj5Ao0d0XIjE6nkBITRvqeD23XXCOG";

        AccessTokenSecret = "kkme15BDCJpwXD4fpQpOBHvXYocNCW6AO6w8Z7zkqKuJf";

    }    public String getConsumerKey() {

        return ConsumerKey;

    }    public String getConsumerSecret() {

        return ConsumerSecret;

    }    public String getAccessToken() {

        return AccessToken;

    }    public String getAccessTokenSecret() {

        return AccessTokenSecret;

    }
}