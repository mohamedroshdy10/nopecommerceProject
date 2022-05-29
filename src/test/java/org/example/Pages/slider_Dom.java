package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.setpDefintions.Hooks._driver;

public class slider_Dom {
    public slider_Dom(WebDriver driver)
    {
        _driver=driver;
    }
    public WebElement sliderPom(int sliderNumber )
    {
        return _driver.findElement(By.xpath("(//a[@class=\"nivo-imageLink\"])["+sliderNumber+"]"));
    }

}
