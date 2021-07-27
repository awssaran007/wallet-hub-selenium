package data;

import core.BaseTest;

import java.io.FileNotFoundException;

public class WalletHubDataFactory extends BaseTest {

    private String url;
    private String userEmail;
    private String passWord;
    private String reviewMessage;
    private String policyType;

   
    public WalletHubDataFactory(  ) throws FileNotFoundException {
        setreviewMessage();
        setPassWord();
        setUrl();
        setUserEmail();
        setpolicyType();
    }


    public String getUrl() {
        return url;
    }


    public void setUrl() throws FileNotFoundException {
        this.url = rx.readConfig().get("wallethubUrl");
    }


    public String getUserEmail() {
        return userEmail;
    }


    public void setUserEmail() throws FileNotFoundException {
        this.userEmail = rx.readConfig().get("userEmail");
    }


    public String getPassWord() {
        return passWord;
    }


    public void setPassWord() throws FileNotFoundException {
        this.passWord = rx.readConfig().get("password");
    }


    public String getreviewMessage() {
        return reviewMessage;
    }


    public void setreviewMessage() throws FileNotFoundException {
        this.reviewMessage = rx.readConfig().get("reviewMessage");
    }

    public String getpolicyType() {
        return policyType;
    }

    public void setpolicyType( ) throws FileNotFoundException {
        this.policyType = rx.readConfig().get("policyType");
    }

}
