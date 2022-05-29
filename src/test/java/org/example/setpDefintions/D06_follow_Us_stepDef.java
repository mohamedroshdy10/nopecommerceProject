package org.example.setpDefintions;

import org.example.Pages.followUs_Dom;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

import static org.example.setpDefintions.Hooks.*;
public class D06_follow_Us_stepDef {

    followUs_Dom followUs_dom = new followUs_Dom(_driver);

    @When("user open facebook link")
    public void userOpenLinkFacebook() throws InterruptedException {
        followUs_dom.WebSite_Pom("facebook").click();
    }

    @When("user open twitter link")
    public void userOpenLinkTwitter() throws InterruptedException {
        followUs_dom.WebSite_Pom("twitter").click();
    }

    @When("user open res link")
    public void userOpenLink_Res() throws InterruptedException {
        followUs_dom.WebSite_Pom("rss").click();
    }

    @When("user open YouTube link")
    public void userOpenLink_youtube() throws InterruptedException {
        followUs_dom.WebSite_Pom("youtube").click();
    }

    @Then("facebook page of nopCommerce is opened in new tab")
    public void facebookAssertion() throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(_driver.getWindowHandles());
        Thread.sleep(2000);
        _driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
    }

    @Then("twitter page of nopCommerce is opened in new tab")
    public void twitterAssertion() throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(_driver.getWindowHandles());
        Thread.sleep(2000);
        _driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
    }

    @Then("New Store News Page is opened")
    public void rssAssertion() throws InterruptedException {
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @Then("youtube page of nopCommerce is opened in new tab")
    public void youTubeAssertion() throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(_driver.getWindowHandles());
        Thread.sleep(2000);
        _driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(Hooks._driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
    }


}


    /**
//    @Then("facebook is  open in new tab")
//    public void FaceBookNew_Tab() throws InterruptedException {
//        Wait(3000);
//        ArrayList<String>Tabs=new ArrayList<>(_driver.getWindowHandles());
//        _driver.switchTo().window(Tabs.get(1));
//
//        System.out.println(_driver.getCurrentUrl());
//        System.out.println(_driver.getTitle());
//
//        Assert.assertTrue(_driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"),_driver.getTitle());
//        _driver.switchTo().window(Tabs.get(0));
//
//        System.out.println(_driver.getCurrentUrl());
//        System.out.println(_driver.getTitle());
//    }
     */
//      @Then("^\"([^\"]*)\" is opened in new tab$")
//      public void facebook_new_tab(String linkType) throws InterruptedException {
//          Thread.sleep(2000);
//          ArrayList<String> Tabs = new ArrayList<>(_driver.getWindowHandles());
//          _driver.switchTo().window(Tabs.get(1));
//          System.out.println(_driver.getCurrentUrl());

//          switch (linkType) {
//              case "facebook":
//                  Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
//                  break;
//              case "twitter":
//                  Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
//                  break;
//              case "rss":
//                      Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
//                  break;
//              case "youtube":
//                  Assert.assertEquals(Hooks._driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
//                  break;
//
//          }

