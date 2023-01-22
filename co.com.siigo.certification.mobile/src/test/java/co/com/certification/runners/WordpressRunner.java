package co.com.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features/wordpress.feature",
        glue = {"co.com.certification.stepdefinitions","co.com.certification.stepdefinitions.hook"
        }
)
public class WordpressRunner {
}
