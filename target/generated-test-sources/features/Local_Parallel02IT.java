import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"D:/IntelliJ/BR_test/cucumber-java-browserstack/src/test/java/resources/features/checkUniformUDxml.feature"},
plugin = {"junit:D:/IntelliJ/BR_test/cucumber-java-browserstack/target/cucumber_reports/test_results/2.junit"},
monochrome = true,
 tags = {"~@ignore"}, glue = { "com.browserstack.stepdefs.API" })
public class Local_Parallel02IT {
}
