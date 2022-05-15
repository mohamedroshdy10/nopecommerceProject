package setpDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static setpDefintions.Hooks.Wait;
import static setpDefintions.Hooks.registerPage;

public class D01_registerStepDef {
    @When("user click the Register link")
    public  void clickRegisterLink()
    {
        registerPage.registerLinkClick().click();
    }
@When("user enter gender")
    public void gender() throws InterruptedException {
    registerPage.genderFemale().click();
    registerPage.genderMale().click();
    Thread.sleep(1000);
}
@And("user enter firstname and lastname")
    public  void fullUserName()
{
    registerPage.FullName("Mohamed","Ahmed");
}
@And("user enter date of birth")
    public  void date_ofBirth() throws InterruptedException {
    Select Day=new Select(registerPage.Data_OF_BirthDay());
    Day.selectByValue("12");
    Select Month=new Select(registerPage.Data_OF_BirthMonth());
    Month.selectByValue("12");
    Select Year=new Select(registerPage.Data_OF_BirthYear());
    Year.selectByValue("2012");
    Thread.sleep(3000);
}
@And("user enter email")
    public  void email()
{
    registerPage.email().sendKeys("test@test.com");
}
@And("user enter company name")
    public  void companyName()
{
    registerPage.companyName().sendKeys("TestCompany");
}
@And("user enter password and Reenter Password")
    public void password()
{
    registerPage.enterPasswordStep("123456","123456");
}
@Then("user click register button")
    public  void registerButton() throws InterruptedException {
    registerPage.registerButton().submit();
    Wait(1500);
}
@And("user have a welcome message with color")
    public  void AssertionResulte() throws InterruptedException {
    String expectedResulte="Your registration completed";
    String ActualResulte=registerPage.SuccessMessage().getText();
    Assert.assertTrue(ActualResulte.contains(expectedResulte));

    String ExpectedColor="rgba(76, 177, 124, 1)";
    String ActualColor=registerPage.SuccessMessage().getCssValue("color");
    System.out.println(ActualColor);
    Assert.assertEquals(ActualColor,ExpectedColor);
    Wait(1500);
}
}
