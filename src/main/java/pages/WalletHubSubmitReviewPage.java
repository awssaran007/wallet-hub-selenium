package pages;



public class WalletHubSubmitReviewPage extends BasePage {

    String drp_policy_box = "//span[@class='dropdown-placeholder' and contains(text(),'Select')]";
    String drp_dwn_value = "//ul[@class='dropdown-list ng-enter-element']/li[contains(text(),'";
    String txt_messageArea = "//*[local-name()='textarea']";
    String btn_submit_review = "//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']";


    public void selectPolicyAndSubmit(String policyType, String review) throws Exception {
        try{
            pageWebDriver.clickWebElementIfDisplayed(drp_policy_box);
            pageWebDriver.clickWebElementIfDisplayed(drp_dwn_value+ policyType +"')]" );
            pageWebDriver.type(txt_messageArea, review);
            pageWebDriver.clickUsingActionClass(btn_submit_review);
        } catch(Exception e ){e.printStackTrace();}
    }






}