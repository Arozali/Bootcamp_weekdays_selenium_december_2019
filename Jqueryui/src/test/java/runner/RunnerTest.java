package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"/Users/arozali/Bootcamp_weekdays_selenium_december_2019/Jqueryui/src/test/java/feature"},
        glue = {"stepDefination"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        strict = true,

        monochrome=true,
        tags={}
        // tags={"@Test1,@Test2"}

)
public class RunnerTest extends AbstractTestNGCucumberTests {

}


