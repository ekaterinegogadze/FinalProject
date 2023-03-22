package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            EmailInput = $(byId("email"));
    public SelenideElement PasswordInput = $(byId("password"));
    public SelenideElement MyAccount = $(byText("ჩემი ანგარიში"));
    public SelenideElement loginBtn = $(byValue("შესვლა"));
    public static SelenideElement emailvald = $(byId("email"));
}
