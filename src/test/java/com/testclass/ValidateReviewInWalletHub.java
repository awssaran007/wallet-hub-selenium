package com.testclass;
import core.BaseTest;
import data.WalletHubDataFactory;
import org.junit.Assert;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;


public class ValidateReviewInWalletHub extends BaseTest   {
    WalletHubDataFactory whDataFactory;

    ValidateReviewInWalletHub() throws FileNotFoundException {   whDataFactory  = new WalletHubDataFactory();  }


    @Test(description = "Validate login to facebook", priority = 1)
    public void test001_LoginToFacebook() throws Exception {
         pageController.WalletHubLoginPage().gotoLandingPage(whDataFactory.getUrl());
          pageController.WalletHubLoginPage().loginToWalletHub(whDataFactory.getUserEmail(),whDataFactory.getPassWord());
          Assert.assertTrue(pageController.WalletHubLandingPage().hoverOverStarsAndClick());
          pageController.WalletHubSubmitReviewPage().selectPolicyAndSubmit(whDataFactory.getpolicyType(),whDataFactory.getreviewMessage());
          pageController.WalletHubSubmitReviewPage().selectPolicyAndSubmit(whDataFactory.getpolicyType(),whDataFactory.getreviewMessage());
          Assert.assertTrue(pageController.WalletHubConfirmReviewPage().isReviewSubmitted());
      }
}

