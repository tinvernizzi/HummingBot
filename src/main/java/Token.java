/**
 * Contains our Twitter token
 */
public class Token {

    private String token1;
    private String token2;
    private String token3;
    private String token4;

    public Token() {
        token1 = "";
        token2 = "";
        token3 = "";
        token4 = "";
    }

    public String getToken1() {
        return token1;
    }

    public String getToken2() {
        return token2;
    }

    public String getToken3() {
        return token3;
    }

    public String getToken4() {
        return token4;
    }

    public void setToken1(String token1) {
        this.token1 = token1;
    }

    public void setToken2(String token2) {
        this.token2 = token2;
    }

    public void setToken3(String token3) {
        this.token3 = token3;
    }

    public void setToken4(String token4) {
        this.token4 = token4;
    }
}