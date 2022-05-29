package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

import static org.example.setpDefintions.Hooks._driver;

public class homePage {
    public  homePage(WebDriver driver)
    {
        _driver=driver;
    }

    public List<WebElement> wishlistIcon()
    {
        return  _driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

    }
    public  WebElement messageDisplay()
    {
        return  _driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public  WebElement numberOfItems()
    {
        return  _driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }
    public  WebElement wishListTab()
    {
        return  _driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }

}
