package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;






@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features\\F01_register.feature",
        glue = "setpDefintions",
        tags = "@regression"
)
public class TestRunners {

}

