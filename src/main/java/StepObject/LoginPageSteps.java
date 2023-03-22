package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

public class LoginPageSteps extends LoginPage {


    @Step("Click MyAccount")
    public LoginPageSteps MyAccount() {
        MyAccount.click();
        return this;
    }

    @Step("fill Email input by value: {email}")
    public LoginPageSteps EmailInput(String email) {
        EmailInput.setValue(email);
        return this;


    }
    @Step("fill Passwird input by value: {password}")
    public LoginPageSteps PasswordInput(String password) {
        PasswordInput.setValue(password);
        return this;
    }

    @Step("Click login Btn")
    public LoginPageSteps loginBtn() {
        loginBtn.click();
        return this;
    }


}

