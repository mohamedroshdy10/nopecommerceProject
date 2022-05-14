package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static setpDefintions.Hooks._driver;

public class RegisterPage {
    //public  static WebDriver driver;

    public  RegisterPage(WebDriver driver)
    {
        _driver=driver;
    }
    public  WebElement genderMale()
    {
        return _driver.findElement(By.id("gender-male"));
    }
    public  WebElement genderFemale()
    {
        return _driver.findElement(By.id("gender-female"));
    }
    public  WebElement firstName()
    {
        return  _driver.findElement(By.id("FirstName"));
    }
    public  WebElement lastName()
    {
        return  _driver.findElement(By.id("LastName"));
    }
    public  WebElement Data_OF_BirthDay()
    {
        return  _driver.findElement(By.name("DateOfBirthDay"));
    }
    public  WebElement Data_OF_BirthMonth()
    {
        return  _driver.findElement(By.name("DateOfBirthMonth"));
    }
    public  WebElement Data_OF_BirthYear()
    {
        return  _driver.findElement(By.name("DateOfBirthYear"));
    }
    public  WebElement email()
    {
        return  _driver.findElement(By.id("Email"));
    }
    public  WebElement companyName()
    {
        return  _driver.findElement(By.id("Company"));
    }
    public  WebElement password()
    {
        return  _driver.findElement(By.id("Password"));
    }
    public  WebElement confirmPassword ()
    {
        return  _driver.findElement(By.id("ConfirmPassword"));
    }
    public  WebElement registerButton ()
    {
        return  _driver.findElement(By.cssSelector("button[name=\"register-button\"]"));
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
        return  _driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement registerLinkClick() {
        return  _driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
}
