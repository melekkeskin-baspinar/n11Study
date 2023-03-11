package bdd.testsuit;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/resources/features/uitests/secondQuestionSearchiPhone.feature")

public class SearchiPhoneTestSuite {
}
