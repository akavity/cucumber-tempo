package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement accountEmailField =
            $(By.xpath("//input[@name='astroauth_login']"));
    private final SelenideElement accountPasswordField =
            $(By.xpath("//input[@name='astroauth_pass']"));
    private final SelenideElement submitAccountButton =
            $(By.xpath("//input[@name='astroauth_submit']"));
    private final SelenideElement accountNotificationError =
            $(By.xpath("//div[@class='popupContent']"));

    public SelenideElement getUserAccountEmail() {
        return accountEmailField;
    }

    public SelenideElement getUserAccountPassword() {
        return accountPasswordField;
    }

    public SelenideElement getSubmitAccountButton() {
        return submitAccountButton;
    }
    public SelenideElement getUserAccountError() {
        return accountNotificationError;
    }
}
