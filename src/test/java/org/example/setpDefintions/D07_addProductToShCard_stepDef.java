package org.example.setpDefintions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.example.Pages.addTo_cardDom.buttonsAdd;
import static org.example.Pages.addTo_cardDom.productNamePom;

public class D07_addProductToShCard_stepDef {


    @When("user click add First product\"HTC One M8 Android L 5.0 Lollipop\"")
    public  void click_addFirstItem() throws InterruptedException {
        buttonsAdd("1").click();
    }

    @Then("user add item open page for the item and found details")
    public void open_ItemSuccessItem1() throws InterruptedException {
       // Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/build-your-own-computer");

        Assert.assertEquals(productNamePom().getText().toLowerCase().trim(),"Build your own computer".toLowerCase().trim());
    }
    @When("user click add second product \"Apple MacBook Pro 13-inch\"")
    public  void click_WishListItem2() throws InterruptedException {
        buttonsAdd("2").click();
    }
    @Then("user add item open page for the item and found details\"Apple MacBook Pro 13-inch\"url page")
    public void open_ItemSuccessItem2() throws InterruptedException {
       // Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
        Assert.assertEquals(productNamePom().getText().toLowerCase().trim(),"Apple MacBook Pro 13-inch".toLowerCase().trim());
    }
    }

