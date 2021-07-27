package pages;


public class WalletHubLandingPage extends BasePage {

    
    String box_rating ="//div[@class='rv review-action ng-enter-element']";
    String txt_fourthStar = "//div[@class='rv review-action ng-enter-element']//*[local-name()='svg'][4]//*[local-name()='g']//*[local-name()='path']";
    String gr_reviewStars = "//div[@class='rv review-action ng-enter-element']//*[local-name()='svg']//*[local-name()='g']";
    String hdr_testReview = "//h4[contains(text(),'Test Insurance Company')]";



    public boolean hoverOverStarsAndClick() throws Exception {
        try {
            pageWebDriver.scrollToVisibleElement(box_rating);
            pageWebDriver.hoverToVisibleElementAndClick(gr_reviewStars, txt_fourthStar);
        }   catch (Exception e) { e.printStackTrace();}
    return  pageWebDriver.waitForPresence(hdr_testReview).isDisplayed();
    }

}