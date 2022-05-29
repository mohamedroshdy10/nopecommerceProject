package org.example.setpDefintions;

import org.example.Pages.slider_Dom;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static org.example.setpDefintions.Hooks.Wait;
import static org.example.setpDefintions.Hooks._driver;

public class D08_homeSliders_stepDef {

  public  slider_Dom slider_dom=new slider_Dom(_driver);



  //firstScenario
    @When("user Click the first_slider")
    public void click_FirstSlider()
    {
        slider_dom.sliderPom(1).click();
    }

    @Then("user open the product which it clickable")
    public  void assert_firstSlider() throws InterruptedException {
        Wait(2000);
        Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/Iphone_s6");
    }

     //second  Scenario
    @When("user Click the second_slider")
    public void click_Consider()
    {
        slider_dom.sliderPom(2).click();
    }

    @Then("user open the product 2 which it clickable")
    public  void assert_SecondSlider() throws InterruptedException {
        Wait(2000);
        Assert.assertEquals(_driver.getCurrentUrl(),"https://demo.nopcommerce.com/Nokia_Lumia_1020");

//        WebDriverWait wait = new WebDriverWait(Hooks._driver,10);
//        boolean check =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
//        Assert.assertTrue(check);

    }
}
