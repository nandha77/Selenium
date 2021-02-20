package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "features/Review.feature", glue = "reviewstepdef",dryRun = false,monochrome=true, plugin = {"pretty","json:target/cucmber.json","html:target/index.html"})


public class ReviewRunner {
	{
	}}
