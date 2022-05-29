package org.example.setpDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D09_wishListStepDef {
    int number;
    @When("user add product to wishlist")
    public  void addTo_wishList() throws InterruptedException {
     Hooks.homePage.wishlistIcon().get(2).click();
    }
    @Then("wishlist notification success is visible")
    public void success_message() throws InterruptedException {
     Hooks.homePage.messageDisplay().isDisplayed();
     String act_Color=  Hooks.homePage.messageDisplay().getCssValue("background-color");
     String ex_Color="rgba(75, 176, 122, 1)";
     Assert.assertEquals(act_Color,ex_Color);
        Thread.sleep(2000);

    }
    @And("user get the  number of wishlist items after adding product")
    public void getNumber()
    {
        String txtNumber= Hooks.homePage.numberOfItems().getText();
     number= BrowserUtilities.convertStringToNumber(txtNumber);
    }
    @Then("number of wishlist items increased")
    public void itemIncreased()
    {
     Assert.assertTrue(number>0);
    }
    @And("user go to wishList page")
    public void wishListPage()
    {
        // can close the message by handel it and click on x and click on wishlist link

        // but we will use explicit wait
//       WebDriverWait wait=new WebDriverWait(_driver, 20);
//       WebElement successMsg=homePage.messageDisplay();
//       wait.until(ExpectedConditions.invisibilityOf(successMsg));
         Hooks._driver.findElement(By.cssSelector("span[class=\"close\"]")).click();
       // click wishList link
        Hooks.homePage.wishListTab().click();


    }

}
