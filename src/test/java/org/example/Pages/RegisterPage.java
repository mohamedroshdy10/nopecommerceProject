package org.example.Pages;

import org.example.setpDefintions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    //public  static WebDriver driver;

    public  RegisterPage(WebDriver driver)
    {
        Hooks._driver=driver;
    }
    public  WebElement genderMale()
    {
        return Hooks._driver.findElement(By.id("gender-male"));
    }
    public  WebElement genderFemale()
    {
        return Hooks._driver.findElement(By.id("gender-female"));
    }
    public  WebElement firstName()
    {
        return  Hooks._driver.findElement(By.id("FirstName"));
    }
    public  WebElement lastName()
    {
        return  Hooks._driver.findElement(By.id("LastName"));
    }
    public  WebElement Data_OF_BirthDay()
    {
        return  Hooks._driver.findElement(By.name("DateOfBirthDay"));
    }
    public  WebElement Data_OF_BirthMonth()
    {
        return  Hooks._driver.findElement(By.name("DateOfBirthMonth"));
    }
    public  WebElement Data_OF_BirthYear()
    {
        return  Hooks._driver.findElement(By.name("DateOfBirthYear"));
    }
    public  WebElement email()
    {
        return  Hooks._driver.findElement(By.id("Email"));
    }
    public  WebElement companyName()
    {
        return  Hooks._driver.findElement(By.id("Company"));
    }
    public  WebElement password()
    {
        return  Hooks._driver.findElement(By.id("Password"));
    }
    public  WebElement confirmPassword ()
    {
        return  Hooks._driver.findElement(By.id("ConfirmPassword"));
    }
    public  WebElement registerButton ()
    {
        return  Hooks._driver.findElement(By.cssSelector("button[name=\"register-button\"]"));
    }

    public  void FullName(String firstName,String lastname)
    {
        this.firstName().sendKeys(firstName);
        this.lastName().sendKeys(lastname);
    }


    public void enterPasswordStep(String password, String confirmPassword) {
        this.password().sendKeys(password);
        this.confirmPassword().sendKeys(confirmPassword);
    }

    public  WebElement SuccessMessage()
    {
        return  Hooks._driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement registerLinkClick() {
        return  Hooks._driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
}
