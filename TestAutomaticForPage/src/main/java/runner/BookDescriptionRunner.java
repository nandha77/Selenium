package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/BookDescription.feature", glue = "bookdescriptionstepdef",dryRun = false,monochrome=true, plugin = {"pretty","json:target/cucmber.json","html:target/index.html"})
public class BookDescriptionRunner {
	

}