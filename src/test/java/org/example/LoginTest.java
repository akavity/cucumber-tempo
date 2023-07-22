package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "org.example.steps",
        features = "src/main/java/org/example/features/Login.feature",
        tags = "@SmokeTest",
        plugin = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
public class LoginTest extends AbstractTestNGCucumberTests {
}
