package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.setpDefintions.Hooks._driver;


public class currencyPage {
  public  currencyPage(WebDriver driver)
  {
      _driver=driver;
  }

  public WebElement currencyDDL()
  {
      return _driver.findElement(By.id("customerCurrency"));
  }
}
