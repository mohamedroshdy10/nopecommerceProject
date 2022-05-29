package org.example.setpDefintions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D03_hoverCategories {

    String subCategoryName;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(Hooks._driver);
        // hover on "Computers"
        WebElement computers = Hooks._driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(computers).perform();
        Thread.sleep(1000);

        // getText() of subCategory before click on it
        WebElement desktops = Hooks._driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategoryName = desktops.getText().toLowerCase().trim();        // this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);
       // click on "Desktops"
        desktops.click();
    }

    @Then("user get subCategory\"Desktops\"displayed as a title")
    public void assertPageTitle() throws InterruptedException {
        String ex_res = "Desktops";
        String ac_res = Hooks._driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText();
        Assert.assertEquals(ac_res.toLowerCase().trim(),ex_res.toLowerCase().trim());
        System.out.println(ac_res);
        System.out.println(ex_res);
    }

}
