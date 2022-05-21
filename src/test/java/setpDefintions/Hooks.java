package setpDefintions;
import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.currencyPage;
import Pages.homePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public  static WebDriver _driver =null;
    public  static   RegisterPage registerPage;
    public static LoginPage loginPage;
    public static currencyPage currencyPage;
    public  static homePage homePage;


    @Before
    public  static void openBrowser() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        _driver =new ChromeDriver();
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        _driver.navigate().to("https://demo.nopcommerce.com/");
        registerPage=new RegisterPage(_driver);
        loginPage=new LoginPage(_driver);
        currencyPage=new currencyPage(_driver);
        homePage=new homePage(_driver);
    }
    @After
    public  static void closeBrowser() throws InterruptedException {
        _driver.quit();Wait(4000);
    }
    public  static void  Wait(long S) throws InterruptedException {Thread.sleep(S);}
}
