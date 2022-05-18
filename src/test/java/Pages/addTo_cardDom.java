package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static setpDefintions.Hooks._driver;

public class addTo_cardDom {
    public addTo_cardDom(WebDriver driver)
    {
        _driver=driver;
    }
    public static WebElement buttonsAdd(String i)
    {
        return   _driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])["+i+"]"));

    }
    public static WebElement productNamePom() {
        return _driver.findElement(By.cssSelector("div[class=\"product-name\"]"));
    }
}
