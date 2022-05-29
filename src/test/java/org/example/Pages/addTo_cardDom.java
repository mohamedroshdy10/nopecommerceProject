package org.example.Pages;

import org.example.setpDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addTo_cardDom {
    public addTo_cardDom(WebDriver driver)
    {
        Hooks._driver=driver;
    }
    public static WebElement buttonsAdd(String i)
    {
        return   Hooks._driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])["+i+"]"));

    }
    public static WebElement productNamePom() {
        return Hooks._driver.findElement(By.cssSelector("div[class=\"product-name\"]"));
    }
}
