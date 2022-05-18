package setpDefintions;

import Pages.followUs_Dom;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

import static setpDefintions.Hooks.*;
public class D06_follow_Us_stepDef {

   followUs_Dom followUs_dom = new followUs_Dom(_driver);
    @When("user open facebook link")
    public  void userOpenLinkFacebook() throws InterruptedException {
        followUs_dom.facebook_pom().submit();
        wait(5000);
    }
//    @Then("facebook is  open in new tab")
//    public void FaceBookNew_Tab() throws InterruptedException {
//        wait(2000);
//        ArrayList<String>Tabs=new ArrayList<>(_driver.getWindowHandles());
//        _driver.switchTo().window(Tabs.get(1));
//        System.out.println(_driver.getCurrentUrl());
//        System.out.println(_driver.getTitle());
//        Assert.assertTrue(_driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"),_driver.getTitle());
//        _driver.switchTo().window(Tabs.get(0));
//
//        System.out.println(_driver.getCurrentUrl());
//        System.out.println(_driver.getTitle());
//        wait(2000);
//    }
}
