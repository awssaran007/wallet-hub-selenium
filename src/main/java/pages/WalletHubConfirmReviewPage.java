package pages;



public class WalletHubConfirmReviewPage extends BasePage {

    String txt_Review = "//h4[contains(text(),'Your review has been posted.')]";
    String btn_continue = "//div[contains(text(),'Continue')]";
    String btn_username = "div[class='brgm-button brgm-user brgm-list-box']>span[class='brgm-list-title']";
    String drp_profile = "//a[contains(text(),'Profile')]";
    String txt_recommendations = "//a[normalize-space()='Test Insurance Company']";



    public boolean isReviewSubmitted( )  {
        boolean isReviewSubmitted = false ;
    try{
        if( pageWebDriver.isWebElementDisplayed(txt_Review)){
            pageWebDriver.clickWebElementIfDisplayed(btn_continue);
            pageWebDriver.hoverOverElement(btn_username);
            pageWebDriver.clickWebElementIfDisplayed(drp_profile);
            isReviewSubmitted = pageWebDriver.isWebElementDisplayed(txt_recommendations);
        }
        else System.out.println("Review not submitted");
    }catch(Exception e){e.printStackTrace();}
    return isReviewSubmitted;}





}