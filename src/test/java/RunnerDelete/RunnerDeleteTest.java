package RunnerDelete;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/FeatureD/Delete.feature",glue="stepsD",monochrome=true,dryRun=true,
snippets=SnippetType.CAMELCASE)
public class RunnerDeleteTest extends AbstractTestNGCucumberTests{
}
