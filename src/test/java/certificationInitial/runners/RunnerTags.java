package certificationInitial.runners;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/Inicial.feature",
        tags="@stories",
        glue ="certificationInitial.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
