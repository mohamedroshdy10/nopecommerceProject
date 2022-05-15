package setpDefintions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static setpDefintions.Hooks.Wait;
import static setpDefintions.Hooks._driver;

public class D07_addProductToShCard_stepDef {
    @When("user click the add to card button")
    public void clickAddToShopping() throws InterruptedException {

       List<WebElement> eleBtn= (List<WebElement>) _driver.findElement(By.cssSelector("class=\"button-2 product-box-add-to-cart-button\""));
       for(int i=0;i<eleBtn.size();i++)
       {
           eleBtn.get(1).click();
       }
       Wait(3000);
    }
}
