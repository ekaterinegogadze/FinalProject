import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LoginPageData.email;
import static DataObject.LoginPageData.password;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.assertTrue;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void UserNameOrPasswprd() {
        loginPageSteps.MyAccount();
        assertTrue(LoginPageSteps.emailvald.is(visible));

        loginPageSteps.EmailInput(email)
                .PasswordInput(password)
                .loginBtn();

        sleep(5000);

    }


}
