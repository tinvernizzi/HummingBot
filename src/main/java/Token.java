package main.java;

public class Token {

    private String ConsumerKey;

    private String ConsumerSecret;

    private String AccessToken;

    private String AccessTokenSecret;    public Token() {

        ConsumerKey = "YsE5Plz7v7n5NRwqgeQsSxuSe";

        ConsumerSecret = "0ttz9lLBlIz59d9qMMtss13RIYUuzGtPivSA8rIvdNsdWQzIP3\n";

        AccessToken = "804391145224753153-ICfEvMYYvDAEqpeGYVZAwwYjGPhb16N";

        AccessTokenSecret = "9mpV2qjRsQsibanF36PhM3iDLjun6gUdYtlMfZZAqX7kq";

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