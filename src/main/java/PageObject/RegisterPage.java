package PageObject;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {
    public SelenideElement
            EmailInput = $("#registration").$(byName("email")),
            PasswordInput = $("#registration").$(byName("password")),
            ConfirmPassWord = $(byId("password_confirmation")),
            MyAccount = $(byText("ჩემი ანგარიში")),
            RegBtn = $(byId("register")),
            NameInput = $(byId("full_name")),
            RegistrationBtn = $(byValue("რეგისტრაცია")),
            MobileInput = $(byId("phone")),


    regvalidation = $(byId("registration"));


}
