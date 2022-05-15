package setpDefintions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static setpDefintions.Hooks.*;
public class D06_follow_Us_stepDef {

    WebElement eleLink=_driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));

    @When("user navigate to the page by click follow us link")
    public  void navigate_to_facebook() throws InterruptedException {
        eleLink.click();
    }
 @Then("user open the  facebook site")
 public void assert_go_toUrl()
 {
     Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
     System.out.println(_driver.getCurrentUrl());
 }
}
