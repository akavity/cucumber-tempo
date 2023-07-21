package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

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
}
