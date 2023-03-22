package StepObject;

import DataObject.RegisterPageData;
import PageObject.RegisterPage;
import io.qameta.allure.Step;

import static DataObject.RegisterPageData.phone;

public class RegisterPageSteps extends RegisterPage {
    @Step("Click MyAccount")
    public RegisterPageSteps MyAccount() {
        MyAccount.click();
        return this;
    }

    @Step("Click Reg Btn")
    public RegisterPageSteps RegBtn() {
        RegBtn.click();
        return this;
    }

    @Step("fill name input by value: {FiestAndLastName}")
    public RegisterPageSteps NameInput(String FirstAndLastName) {
        NameInput.setValue(FirstAndLastName);
        return this;
    }

    @Step("fill mobile input by value: {phone}")
    public RegisterPageSteps MobileInput(String phone) {
        MobileInput.setValue(phone);
        return this;
    }

    @Step("fill email input by value: {Email}")
    public RegisterPageSteps EmailInput(String Email) {
        EmailInput.setValue(Email);
        return this;


    }

    @Step("fill password input by value: {PassWord}")
    public RegisterPageSteps PasswordInput(String PassWord) {
        PasswordInput.setValue(PassWord);
        return this;
    }

    @Step("fill ConfimPassWord input by value: {ConFirmPass}")
    public RegisterPageSteps ConfirmPassWord(String ConFirmPass) {
        ConfirmPassWord.setValue(ConFirmPass);
        return this;
    }

    @Step("Click Registration Btn")
    public RegisterPageSteps RegistrationBtn() {
        RegistrationBtn.click();
        return this;
    }

}

