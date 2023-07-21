package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "org/example/steps",
        features = "src/main/java/org/example/features",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json"})
public class LoginTest extends AbstractTestNGCucumberTests {
}
