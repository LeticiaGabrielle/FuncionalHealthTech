package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import steps.FuncionalTechSteps;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources"},
        glue = {"steps"},
        tags = {"@Feature"}
)
public class Runner {

    @AfterClass
    public static void encerrar() {
        FuncionalTechSteps.driver.quit();
    }
}
