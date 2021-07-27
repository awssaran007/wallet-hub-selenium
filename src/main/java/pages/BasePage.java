package pages;

import driver.WebDriverClient;



public class BasePage {

    WebDriverClient pageWebDriver;

    public BasePage() { pageWebDriver = new  WebDriverClient();  }

    public String gotoLandingPage(String url) {
            pageWebDriver.launchURL(url);
            return pageWebDriver.title();
    }

    public boolean isElementPresent(String locator) {
        return pageWebDriver.isWebElementDisplayed(locator);
    }
}
