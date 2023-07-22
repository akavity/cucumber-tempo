package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.example.pages.LoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I open page {string}")
    public void openPage(String page) {
        open(page);
    }

    @When("I enter the email {string} and the password {string}")
    public void enterEmailAndPassword(String email, String password) {
        loginPage.getUserAccountEmail().setValue(email);
        loginPage.getUserAccountPassword().setValue(password);
        loginPage.getSubmitAccountButton().click();
    }

    @Then("I want to get the errorText {string}")
    public void getErrorText(String errorText) {
        loginPage.getUserAccountError().shouldHave(text(errorText));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Failed screen", new ByteArrayInputStream(screenshot));
        }
    }
}
