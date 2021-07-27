package core;


import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import pages.WalletHubConfirmReviewPage;
import pages.WalletHubLandingPage;
import pages.WalletHubLoginPage;
import pages.WalletHubSubmitReviewPage;


public class Controller {

    public WalletHubLoginPage WalletHubLoginPage() {return new WalletHubLoginPage(); }

    public WalletHubLandingPage WalletHubLandingPage() {return new WalletHubLandingPage(); }

    public WalletHubSubmitReviewPage WalletHubSubmitReviewPage(){return new WalletHubSubmitReviewPage();};

    public WalletHubConfirmReviewPage WalletHubConfirmReviewPage(){return new WalletHubConfirmReviewPage();};


}

