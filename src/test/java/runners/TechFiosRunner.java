package runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features",
glue="steps",
tags= {"@TechFiosFeature"},
monochrome=true,
dryRun=false,
plugin= {
		"pretty",
		"html:target/reports/cucumber.html",
		"json:targer/reports/cucumber.json"
		
}


)
public class TechFiosRunner {

}
