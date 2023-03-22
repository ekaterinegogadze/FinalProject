import StepObject.RegisterPageSteps;
import Utils.ChromeRunner;

import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.RegisterPageData.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class RegisterPageTest extends ChromeRunner {
    RegisterPageSteps RegisterPageSteps = new RegisterPageSteps();

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void RegisterMeTod() {
        RegisterPageSteps.MyAccount()
                .RegBtn();
        assertTrue(RegisterPageSteps.regvalidation.is(visible));

        RegisterPageSteps.NameInput(FirstAndLastName)
                .MobileInput(phone)
                .EmailInput(Email);
        assertEquals(RegisterPageSteps.EmailInput.getValue(), Email);
        RegisterPageSteps.ConfirmPassWord(PassWord)
                .PasswordInput(PassWord)
                .RegistrationBtn();

        sleep(5000);


    }
}



